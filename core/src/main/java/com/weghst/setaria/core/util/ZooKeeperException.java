/**
 * Copyright (C) 2016 The Weghst Inc. <kevinz@weghst.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.weghst.setaria.core.util;

/**
 * ZooKeeper 异常类型.
 *
 * @author Kevin Zou (zouyong@shzhiduan.com)
 */
public class ZooKeeperException extends RuntimeException {

    /**
     * 通过 ZooKeeper 异常创建实例.
     *
     * @param cause 目标异常
     */
    public ZooKeeperException(Throwable cause) {
        super(cause);
    }
}
