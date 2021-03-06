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
package com.weghst.setaria.client.converter;

import com.weghst.setaria.client.WrongConfigValueException;

/**
 * 字符器类型转换器.
 *
 * @author Kevin Zou (kevinz@weghst.com)
 */
public interface ValueConverter<T> {

    /**
     * 将属性值转换为目标数据类型.
     *
     * @param key   键
     * @param value 值
     * @return 值
     * @throws WrongConfigValueException 如果值类型与目标类型不匹配
     */
    T convert(String key, String value) throws WrongConfigValueException;

    /**
     * 将属性值转换为目标数据类型. 如果值类型不匹配或者未设置则返回默认值.
     *
     * @param key          键
     * @param value        值
     * @param defaultValue 默认值
     * @return 值
     */
    T convert(String key, String value, T defaultValue);

}
