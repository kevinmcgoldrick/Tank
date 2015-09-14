package com.intuit.tank.vm.common;

/*
 * #%L
 * Intuit Tank Api
 * %%
 * Copyright (C) 2011 - 2015 Intuit Inc.
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */

public class ThreadLocalUsernameProvider extends ThreadLocal<UsernameProvider> {
    private static ThreadLocalUsernameProvider userProvider = new ThreadLocalUsernameProvider();

    public static UsernameProvider getUsernameProvider() {
        return userProvider.get();
    }

    public UsernameProvider initialValue() {
        return new UsernameProvider();

    }

}
