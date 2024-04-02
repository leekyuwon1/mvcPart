## _HttpServletRequest_
* * *
<br>

### _HttpServletRequest 역할_
HTTP 요청 메시지를 개발자가 직접 파싱하여 사용해도 무관하지만, 매우 불편할 것이다. 때문에 **서블릿은 개발자가 HTTP 요청 메시지를 관리하게 사용할 수 있도록 개발자 대신에 HTTP 요청 메시지를 파싱한다.** 그리고 그 결과를 `HttpServletRequest` 객체에 담아서 제공. <br><br>

예를 들어보자! `HttpServletRequest` 객체를 사용하면, 다음과 같은 HTTP 요청 메시지를 편리하게 조회할 수 있다.
```
POST /save HTTP/1.1  // START LINE
Host: localhost:8080 // 헤더
Content-Type: application/x-www-form-urlencoded // 헤더

username=kim&age=20 // 바디
```
* START LINE
  * HTTP 메소드
  * URL
  * 쿼리 스트링
  * 스키마, 프로토콜
* 헤더
  * 헤더 조회
* 바디
  * Form 파라미터 형식 조회
  * message body 데이터 직접 조회
  
`HttpServletRequest` 객체는 추가로 여러가지 부가 기능도 제공한다.
1. **임시 저장소**
   * 해당 HTTP 요청이 시작부터 끝날 때 까지 유지되는 임시 저장소 기능 ( 요청이 들어오고 나갈 때 까지가 생존 범위 )
     * 저장 : `request.setAttribute(name, value)`
     * 조회 : `request.getAttribute(name)`
2. **세션 관리**
   * `request.getSession(create:true)`

> **중요**<br>
> HttpServletRequest, HttpServletResponse 를 사용할 때 가장 중요한 점은 이 객체들이 HTTP 요청 메시지, HTTP 응답 메시지를 편리하게 사용하도록 도와주는 객체라는 점이다. 따라서 이 기능에 대해서 깊이 있는 이해를 하려면 **HTTP 스펙이 제공하는 요청, 응답 메시지** 자체를 이해하여야 한다.

## _Front Controller 도입_
* * *

프론트 컨트롤러란, 기존 컨트롤러 로직 앞에 문을 하나 두는 역할이다.
클라이언트 쪽에서 컨트롤러를 호출시, 기존에서는 따로된 컨트롤러를 호출하는 반면, 프론트 컨트롤러를 도입하면 클라이언트가 프론트 컨트롤러를 호출하면 프론트 컨트롤러가 알맞은 컨트롤러를 호출하는 방식이다.

**_특징_**
* 프론트 컨트롤러 서블릿 하나로 클라이언트 요청을 받는다.( 기존에서는 각각 받았음. )
* 프론트 컨트롤러가 요청에 맞는 컨트롤러를 찾아서 호출
* 입구를 하나로 만든다.
* 공통 처리가 가능하다.
* 프론트 컨트롤러를 제외한 나머지 컨트롤러는 서블릿을 사용하지 않아도 된다.
* 

