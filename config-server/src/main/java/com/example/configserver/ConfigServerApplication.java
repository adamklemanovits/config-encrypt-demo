package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.bootstrap.encrypt.KeyProperties;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.encryption.CipherEnvironmentEncryptor;
import org.springframework.cloud.config.server.encryption.EnvironmentEncryptor;
import org.springframework.cloud.config.server.encryption.KeyStoreTextEncryptorLocator;
import org.springframework.cloud.config.server.encryption.SingleTextEncryptorLocator;
import org.springframework.cloud.config.server.encryption.TextEncryptorLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.rsa.crypto.KeyStoreKeyFactory;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
