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
package com.weghst.setaria.core.repository;

import org.springframework.stereotype.Repository;

import com.weghst.setaria.core.domain.ConfigChangedHistory;

/**
 * 配置修改历史数据库访问接口定义.
 *
 * @author Kevin Zou (kevinz@weghst.com)
 */
@Repository
public interface ConfigChangedHistoryRepository {

    /**
     * 保存配置修改历史信息.
     *
     * @param configChangedHistory 配置修改历史
     * @return 受影响行记录数
     */
    int save(ConfigChangedHistory configChangedHistory);
}
