package com.mklee.myhomebatch.applyhome.config;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class ApplyhomeApiConfiguration {
    @Bean
    public RequestInterceptor requestInterceptor(@Value("${myhome.api.key}") String serviceKey) {
        return requestTemplate -> requestTemplate
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .query("serviceKey", serviceKey);
    }
}
