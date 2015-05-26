
package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ���������� ��� ������� �������� ����������.
 */
@Controller
public class HelloController {

	private int visitorCount = 0;

	@RequestMapping("/index.html")
	public String index(Model model) {
		model.addAttribute("visitorCount", visitorCount++);
		return "WEB-INF/pages/hello.jsp";
	}

}