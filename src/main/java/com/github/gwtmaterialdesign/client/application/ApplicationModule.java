package com.github.gwtmaterialdesign.client.application;

import com.github.gwtmaterialdesign.client.application.googlecontacts.GoogleContactsModule;
import com.github.gwtmaterialdesign.client.application.googledrive.GoogleDriveModule;
import com.github.gwtmaterialdesign.client.application.googleplus.GooglePlusModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new GoogleDriveModule());
        install(new GoogleContactsModule());
        install(new GooglePlusModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
