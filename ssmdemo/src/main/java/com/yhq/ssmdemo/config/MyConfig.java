package com.yhq.ssmdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
public class MyConfig {

	/**
	 * 配置tkmybatis扫描器
	 * @return
	 */
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setMarkerInterface(Mapper.class);
		mapperScannerConfigurer.setBasePackage("com.yhq.ssmdemo.web.dao");
		return mapperScannerConfigurer;
	}
}
