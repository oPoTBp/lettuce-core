/*
 * Copyright 2011-2018 the original author or authors.
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
package com.lambdaworks.redis.commands.rx;

import com.lambdaworks.redis.api.sync.RedisCommands;
import com.lambdaworks.redis.commands.BitCommandTest;

/**
 * @author Mark Paluch
 */
public class BitRxCommandTest extends BitCommandTest {

    @Override
    protected RedisCommands<String, String> connect() {
        bitstring = RxSyncInvocationHandler.sync(client.connectAsync(new BitStringCodec()).getStatefulConnection());
        return RxSyncInvocationHandler.sync(client.connectAsync().getStatefulConnection());
    }
}
