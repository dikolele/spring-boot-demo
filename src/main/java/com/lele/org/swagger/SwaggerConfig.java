package com.lele.org.swagger;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhangql 2018/08/04 swagger 配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private ApiInfo apiInfo(){
		ApiInfo apiInfo = new ApiInfo("zhangql spring cloud 1 documents",//
				"spring cloud 练习接口文档",
				"1.0",
				"这是啥",
				new Contact("zhangql", "", "qianleZhang@163.com"),//作者
				"链接显示文字",
				"http://www.baidu.com/"//w网站链接
				);
		return apiInfo;
	}

}
