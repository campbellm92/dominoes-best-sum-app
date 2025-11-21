package com.matthew.domino.api;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class DominoAPIApplication extends Application<DominoAPIConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DominoAPIApplication().run(args);
    }

    @Override
    public String getName() {
        return "DominoAPI";
    }

    @Override
    public void initialize(final Bootstrap<DominoAPIConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DominoAPIConfiguration configuration,
            final Environment environment) {
        // TODO: implement application
    }

}
