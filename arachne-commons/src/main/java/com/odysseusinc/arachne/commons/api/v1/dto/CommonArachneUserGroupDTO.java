/**
 *
 * Copyright 2017 Observational Health Data Sciences and Informatics
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Company: Odysseus Data Services, Inc.
 * Product Owner/Architecture: Gregory Klebanov
 * Authors: Pavel Grafkin, Alexandr Ryabokon, Vitaly Koulakov, Anton Gackovka, Maria Pozhidaeva, Mikhail Mironov
 * Created: January 13, 2017
 *
 */

package com.odysseusinc.arachne.commons.api.v1.dto;

import java.util.Collection;

public class CommonArachneUserGroupDTO extends CommonUuidDTO {
    private String name;
    private Collection<CommonArachneUserDTO> users;
    private CommonArachneUserDTO admin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<CommonArachneUserDTO> getUsers() {
        return users;
    }

    public void setUsers(Collection<CommonArachneUserDTO> users) {
        this.users = users;
    }

    public CommonArachneUserDTO getAdmin() {
        return admin;
    }

    public void setAdmin(CommonArachneUserDTO admin) {
        this.admin = admin;
    }
}