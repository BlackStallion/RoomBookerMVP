package com.macoscpoe.roombooker.injector.scope;

/**
 * Created by Piotr Ziomacki on 30/11/15.
 * Copyright © 2015 Macoscope sp. z o.o. All rights reserved.
 */

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Scope
@Retention(RUNTIME) public @interface PerActivity {}
