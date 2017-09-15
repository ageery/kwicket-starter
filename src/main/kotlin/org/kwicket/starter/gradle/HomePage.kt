package org.kwicket.starter.gradle

import de.agilecoders.wicket.core.markup.html.bootstrap.html.HtmlTag
import de.agilecoders.wicket.core.markup.html.bootstrap.html.IeEdgeMetaTag
import de.agilecoders.wicket.core.markup.html.bootstrap.html.MobileViewportMetaTag
import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.model.ResourceModel
import org.apache.wicket.request.mapper.parameter.PageParameters
import org.kwicket.component.q
import org.kwicket.model.ldm
import org.kwicket.model.model
import org.kwicket.wicket.core.markup.html.basic.KLabel
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class HomePage(pageParameters: PageParameters? = null) : WebPage(pageParameters) {

    init {
        q(HtmlTag("html"))
        q(Label("title", ResourceModel("page.title")))
        q(MobileViewportMetaTag("viewport"))
        q(IeEdgeMetaTag("ie-edge"))
        q(KLabel(id = "msg", model = "Hello, World".model()))
        q(KLabel(id = "time", model = { LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME) }.ldm()))
    }

}