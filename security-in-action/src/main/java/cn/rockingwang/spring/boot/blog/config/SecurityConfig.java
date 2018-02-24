package cn.rockingwang.spring.boot.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全配置类
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 都可以访问
                .antMatchers("/css/**", "/js/**", "fonts/**", "/index").permitAll()
                // 需要对应的角色才能访问
                .antMatchers("/users/**").hasRole("ADMIN")
                .and()
                // 基于 Form 表单登录验证
                .formLogin()
                // 自定义登录界面
                .loginPage("/login").failureUrl("/login-error");
    }

    /**
     * 认证信息管理
     *
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                // 认证信息存储于内存中
                .inMemoryAuthentication()
                .withUser("wangpeng").password("123456").roles("ADMIN");
    }
}
