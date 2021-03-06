package com.github.gwtmaterialdesign.client.gin;

import com.github.gwtmaterialdesign.client.application.ApplicationModule;
import com.github.gwtmaterialdesign.client.place.NameTokens;
import com.github.gwtmaterialdesign.client.resources.ResourceLoader;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule.Builder().build());
        install(new ApplicationModule());

        bind(ResourceLoader.class).asEagerSingleton();

        // DefaultPlaceManager Places
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.google_plus);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.google_plus);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.google_plus);
    }
}
