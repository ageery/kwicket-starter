package org.kwicket.starter.gradle

import de.agilecoders.wicket.core.markup.html.themes.bootstrap.BootstrapTheme
import de.agilecoders.wicket.core.settings.SingleThemeProvider
import org.apache.wicket.RuntimeConfigurationType
import org.kwicket.agilecoders.enableBootstrap
import org.kwicket.wicket.core.protocol.http.KWebApplication

class StarterWebApplication(configurationType: RuntimeConfigurationType) :
    KWebApplication(configurationType = configurationType) {

    override fun getHomePage() = HomePage::class.java

    override fun init() {
        super.init()
        enableBootstrap(themeProvider = SingleThemeProvider(BootstrapTheme()))
    }

}