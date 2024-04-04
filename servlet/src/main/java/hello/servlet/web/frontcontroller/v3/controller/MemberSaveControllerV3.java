package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {
    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public ModelView process(Map<String, String> paramMap) {
        String username = paramMap.get("username"); // 파라미터 { "username" = " " } 정보를 불러온다.
        int age = Integer.parseInt(paramMap.get("age")); // 파라미터 { "age" = " " } 정보를 불러온다.

        Member member = new Member(username, age); // kim, 20

        memberRepository.save(member); // 저장

        ModelView mv = new ModelView("save-result"); // 논리이름
        mv.getModel().put("member", member); // save에서 저장된 결과를 모델에 넣어준다.
        return mv;
    }
}
