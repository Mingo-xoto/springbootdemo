package com.yhq.ssmdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yhq.ssmdemo.web.mysql.MySqlMapper;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
public class MyConfig {

	/**
	 * 配置tkmybatis扫描器
	 * 
	 * @return
	 */
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setMarkerInterface(MySqlMapper.class);
		mapperScannerConfigurer.setBasePackage("com.yhq.ssmdemo.web.mysql.dao");
		return mapperScannerConfigurer;
	}
}
