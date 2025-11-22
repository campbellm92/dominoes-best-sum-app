package com.matthew.domino;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

import com.matthew.domino.resources.DominoResource;

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
        // cli, templates, etc -> not needed for now
    }

    @Override
    public void run(DominoAPIConfiguration config, Environment env) {
        env.jersey().register(new DominoResource());
    }

}
