package cl.rideapp.api_gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.config.Customizer;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

        @Bean
        public SecurityWebFilterChain securityWebFilterChain(
                        org.springframework.security.config.web.server.ServerHttpSecurity http) {

                http
                                .csrf(csrf -> csrf.disable())
                                .authorizeExchange(exchanges -> exchanges
                                                // Rutas públicas - login y registro
                                                .pathMatchers("/api/usuarios/login").permitAll()
                                                .pathMatchers("/api/usuarios/crear").permitAll()
                                                // Todo lo demás requiere token JWT
                                                .anyExchange().authenticated())
                                .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()));

                return http.build();
        }
}
