package com.example.app.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//ルートにアクセスした場合にコントローラーが起動
@RequestMapping("/")
public class IndexController {
	
	//GETメソッドによってアクセスされた場合に起動
	@GetMapping
	public String index(Model model) {
		//htmlファイルを返す
		return "index";
	}
}
