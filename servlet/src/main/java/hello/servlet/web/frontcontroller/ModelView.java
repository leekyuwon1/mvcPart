package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

public class ModelView {
    private String viewName; // 물리 이름 즉 (new-form, members, save)
    private Map<String, Object> model = new HashMap<>(); // 모델

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public ModelView setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public ModelView setModel(Map<String, Object> model) {
        this.model = model;
        return this;
    }
}
