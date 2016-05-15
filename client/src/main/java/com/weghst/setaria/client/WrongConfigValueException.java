/**
 * Copyright (C) 2016 The Weghst Inc. <kevinz@weghst.com>
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.weghst.setaria.client;

/**
 * 错误的配置属性值异常.
 *
 * @author Kevin Zou (kevinz@weghst.com)
 */
public class WrongConfigValueException extends RuntimeException {

    private String key;
    private String value;

    /**
     * 通过配置键, 值与目标异常构建异常.
     *
     * @param key   配置键
     * @param value 配置值
     * @param cause 目标异常
     */
    public WrongConfigValueException(String key, String value, Throwable cause) {
        super(formatMessage(key, value), cause);
        this.key = key;
        this.value = value;
    }

    /**
     * 返回属性值错误的键.
     *
     * @return 键
     */
    public String getKey() {
        return key;
    }

    /**
     * 返回错误的属性值.
     *
     * @return 值
     */
    public String getValue() {
        return value;
    }

    private static String formatMessage(String propertyName, String propertyValue) {
        return String.format("错误的属性配置 [%s: %s]", propertyName, propertyValue);
    }
}
