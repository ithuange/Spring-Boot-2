package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {
	/*
	 * @Autowired private BrandService brandService;
	 * 
	 * @GetMapping public Result<List<Brand>> findList(){ List<Brand> brandList =
	 * brandService.findList(); return new Result<>(true,
	 * StatusCode.OK,"查询成功",brandList); }
	 */
	
	@GetMapping("find")
	public String findAlll() {
		return "hello,hello";
	}
	@PostMapping()
	public String findList() {
		return 
	}
}
