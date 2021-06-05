package com.edu.nju.alley.config;

import com.aliyun.oss.OSSClient;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("oss")
public class OSSConfig {

    private final OSS oss;

    @Autowired
    public OSSConfig(OSS oss) {
        this.oss = oss;
    }

    @Bean
    public OSS oss() {
        return new OSS();
    }

    @Bean
    public OSSClient ossClient() {
        return new OSSClient(oss.getEndPoint(), oss.getAccesskeyId(), oss.getAccesskeySecret());
    }

    @Data
    public static class OSS {
        @Value("bucket-name")
        private String bucketName;

        @Value("end-point")
        private String endPoint;

        @Value("accesskey-id")
        private String accesskeyId;

        @Value("accesskey-secret")
        private String accesskeySecret;

        @Value("dir")
        private String dir;

        @Value("callback")
        private String callback;

        @Value("max_size")
        private Integer maxSize;
    }

}
