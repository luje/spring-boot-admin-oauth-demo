package org.ljesys.springbootadmin.config;

import de.codecentric.boot.admin.server.config.AdminServerAutoConfiguration;
import de.codecentric.boot.admin.server.config.AdminServerProperties;
import org.ljesys.springbootadmin.client.BearerAuthHeaderProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

import static java.util.Collections.singletonList;

@Configuration
public class AdminServerConfiguration extends AdminServerAutoConfiguration {

    public AdminServerConfiguration(AdminServerProperties adminServerProperties) {
        super(adminServerProperties);
    }

    @Bean
    @Order(0)
    @ConditionalOnMissingBean
    public BearerAuthHeaderProvider bearerAuthHeaderProvider(@Value("${security.oauth2.client.accessTokenUri}") String accessTokenUri) {
        ClientCredentialsResourceDetails details = new ClientCredentialsResourceDetails();

        //set you details here: id, clientid, secret, tokenendpoint
        details.setClientId("actuator");
        details.setClientSecret("actuator_password");
        details.setAccessTokenUri(accessTokenUri);
        details.setGrantType("client_credentials");
        details.setScope(singletonList("actuator"));

        return new BearerAuthHeaderProvider(new OAuth2RestTemplate(details));
    }

}
