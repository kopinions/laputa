package com.thoughtworks.beans;
/*
 * Copyright 2014-2015 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "laputa:faqitem")
@Node(jcrType = "laputa:faqitem")
public class FaqItem extends BaseDocument {

    @HippoEssentialsGenerated(internalName = "laputa:question")
    public String getQuestion() {
        return getProperty("laputa:question");
    }

    @HippoEssentialsGenerated(internalName = "laputa:answer")
    public HippoHtml getAnswer() {
        return getHippoHtml("laputa:answer");
    }
}
