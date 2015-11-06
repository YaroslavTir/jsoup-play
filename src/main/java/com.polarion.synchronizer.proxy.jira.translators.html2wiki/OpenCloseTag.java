/*
 * Copyright (C) 2004-2015 Polarion Software
 * All rights reserved.
 * Email: dev@polarion.com
 *
 *
 * Copyright (C) 2004-2015 Polarion Software
 * All Rights Reserved.  No use, copying or distribution of this
 * work may be made except in accordance with a valid license
 * agreement from Polarion Software.  This notice must be
 * included on all copies, modifications and derivatives of this
 * work.
 *
 * POLARION SOFTWARE MAKES NO REPRESENTATIONS OR WARRANTIES
 * ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESSED OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. POLARION SOFTWARE
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */
package com.polarion.synchronizer.proxy.jira.translators.html2wiki;

import org.jsoup.nodes.Element;

public class OpenCloseTag extends RecursiveTag {
    final String openStr;
    final String closeStr;
    final boolean isPrint;

    public OpenCloseTag(String openStr, String closeStr, boolean isPrint) {
        this.openStr = openStr;
        this.closeStr = closeStr;
        this.isPrint = isPrint;
    }

    public OpenCloseTag(String openStr, String closeStr) {
        this(openStr, closeStr, false);
    }


    public void open(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append(openStr);
    }

    public void close(Element element, ElementInfo elementInfo, StringBuilder sb) {
        sb.append(closeStr);
    }

}
