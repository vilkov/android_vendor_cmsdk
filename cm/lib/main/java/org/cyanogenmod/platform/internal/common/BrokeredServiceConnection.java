/**
 * Copyright (C) 2016 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cyanogenmod.platform.internal.common;

/**
 * The {@link BrokeredServiceConnection} provides callbacks for when a
 * {@link org.cyanogenmod.platform.internal.BrokerableCMSystemService} interface
 * contract is either fulfilled and connected to an implementation or disconnected.
 */
public interface BrokeredServiceConnection {

    /**
     * Callback that signifies that the given interface contract passed into the
     * {@link org.cyanogenmod.platform.internal.BrokerableCMSystemService} is implemented
     * and connected.
     */
    void onBrokeredServiceConnected();

    /**
     * Callback that signifies that the given implementation for the interface contract passed
     * into the {@link org.cyanogenmod.platform.internal.BrokerableCMSystemService} is disconnected.
     */
    void onBrokeredServiceDisconnected();
}
