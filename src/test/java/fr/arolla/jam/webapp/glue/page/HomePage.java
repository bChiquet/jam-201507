package fr.arolla.jam.webapp.glue.page;

import org.fluentlenium.core.FluentPage;

public class HomePage extends FluentPage {

    @Override
    public String getUrl() {
        return "http://localhost:9090/";
    }
}
