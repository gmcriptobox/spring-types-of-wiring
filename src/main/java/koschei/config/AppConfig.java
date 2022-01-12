package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.Island2;
import koschei.models.Wood3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Autowired
    private KoscheiTheDeathless koscheiTheDeathless;

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
}
