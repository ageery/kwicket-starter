package org.kwicket.starter.gradle

import org.apache.wicket.RuntimeConfigurationType
import org.kwicket.wicket.core.protocol.http.KWicketFilter
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import javax.servlet.Filter

@SpringBootApplication
class StarterApplication {

    @Value("\${wicket.config}")
    private lateinit var wicketConfig: RuntimeConfigurationType

    @Bean
    fun getWicketFilter(): Filter = KWicketFilter(webApp = StarterWebApplication(configurationType = wicketConfig))

}

fun main(args: Array<String>) {
    SpringApplication.run(StarterApplication::class.java)
}