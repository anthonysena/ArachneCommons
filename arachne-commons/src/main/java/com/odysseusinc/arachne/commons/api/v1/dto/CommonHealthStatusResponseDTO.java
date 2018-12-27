/*
 *
 * Copyright 2018 Odysseus Data Services, inc.
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
 * Created: July 27, 2017
 *
 */

package com.odysseusinc.arachne.commons.api.v1.dto;

public class CommonHealthStatusResponseDTO {

    private CommonHealthStatus status;
    private String reason;
    private Boolean deleted;

    public CommonHealthStatusResponseDTO() {

    }

    public CommonHealthStatus getStatus() {

        return status;
    }

    public void setStatus(CommonHealthStatus status) {

        this.status = status;
    }

    public String getReason() {

        return reason;
    }

    public void setReason(String reason) {

        this.reason = reason;
    }

    public Boolean getDeleted() {

        return deleted;
    }

    public void setDeleted(Boolean deleted) {

        this.deleted = deleted;
    }
}
