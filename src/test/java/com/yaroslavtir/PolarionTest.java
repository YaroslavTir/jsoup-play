package com.yaroslavtir;


import junit.framework.Assert;
import org.junit.Test;

public class PolarionTest {

    @Test
    public void test() throws Exception {
            long start = System.currentTimeMillis();
            String result = new JsoupParser().start(html);
            System.out.println(result);
            System.out.println(System.currentTimeMillis() - start);
            Assert.assertNotNull(result);
    }


    public static final String html2 = "<br/>" +
            "<table>\n" +
            "    <tbody>\n" +
            "    <tr>\n" +
            "        <th style=\"color: #757575\">noting</th>\n" +
            "        <th>head1</th>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td>a<img/></td>\n" +
            "        <td> 1</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td>b<img/></td>\n" +
            "        <td> 2</td>\n" +
            "    </tr>\n" +
            "    </tbody>\n" +
            "</table>\n";


    public static final String html = "<b>Test Run:</b> <span id=\"link\" class=\"polarion-rte-link\" data-type=\"testRun\" data-item-id=\"hello world\"\n" +
            "                       data-option-id=\"long\"></span><br/><b>Test Case:</b> <span id=\"link\" class=\"polarion-rte-link\"\n" +
            "                                                                                 data-type=\"workItem\"\n" +
            "                                                                                 data-item-id=\"EL-3\"\n" +
            "                                                                                 data-option-id=\"long\"\n" +
            "                                                                                 data-revision=\"5591\"></span><br/>\n" +
            "<table class=\"polarion-no-style-cleanup\" style=\"border-collapse: collapse;\">\n" +
            "    <tr style=\"text-align: left; white-space: nowrap; color: #757575; border-bottom: 1px solid #d2d7da; background-color: #ffffff;\">\n" +
            "        <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></th>\n" +
            "        <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">#</th>\n" +
            "        <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span title=\"Step\">Step</span>\n" +
            "        </th>\n" +
            "        <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "                title=\"Step Description\">Step Description</span></th>\n" +
            "        <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "                title=\"Expected Result\">Expected Result</span></th>\n" +
            "        <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">Actual Result</th>\n" +
            "    </tr>\n" +
            "    <tr style=\"border-bottom: 1px solid #f0f0f0;\">\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "                title=\"Passed\"><span style=\"white-space:nowrap;\"><img\n" +
            "                src=\"/polarion/icons/default/enums/testrun_status_passed.png\"\n" +
            "                style=\"vertical-align:text-bottom;border:0px;margin-right:2px;\"\n" +
            "                class=\"polarion-no-style-cleanup\"/></span></span></td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "            \n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "            Open User Account Page\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">Login to E-Library\n" +
            "            Portal, and click user name in top left corner\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">The user account\n" +
            "            page is shown\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></td>\n" +
            "    </tr>\n" +
            "    <tr style=\"border-bottom: 1px solid #f0f0f0;\">\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "                title=\"Passed\"><span style=\"white-space:nowrap;\"><img\n" +
            "                src=\"/polarion/icons/default/enums/testrun_status_passed.png\"\n" +
            "                style=\"vertical-align:text-bottom;border:0px;margin-right:2px;\"\n" +
            "                class=\"polarion-no-style-cleanup\"/></span></span></td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "            2\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "            Create new user\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">Click on &quot;Create\n" +
            "            new user&quot; link\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">The dialog to\n" +
            "            create a new user is shown\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></td>\n" +
            "    </tr>\n" +
            "    <tr style=\"border-bottom: 1px solid #f0f0f0;\">\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "                title=\"Passed\"><span style=\"white-space:nowrap;\"><img\n" +
            "                src=\"/polarion/icons/default/enums/testrun_status_passed.png\"\n" +
            "                style=\"vertical-align:text-bottom;border:0px;margin-right:2px;\"\n" +
            "                class=\"polarion-no-style-cleanup\"/></span></span></td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "            3\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "            Enter name with tab key\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">Type: foo\\tbar\n" +
            "            (where \\t is tab key)\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></td>\n" +
            "    </tr>\n" +
            "    <tr style=\"border-bottom: 1px solid #f0f0f0;\">\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "                title=\"Failed\"><span style=\"white-space:nowrap;\"><img\n" +
            "                src=\"/polarion/icons/default/enums/testrun_status_failed.png\"\n" +
            "                style=\"vertical-align:text-bottom;border:0px;margin-right:2px;\"\n" +
            "                class=\"polarion-no-style-cleanup\"/></span></span></td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "            4\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "            Save it\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">Click &quot;Search&quot;</td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">System reports that\n" +
            "            the username cannot contain tab key\n" +
            "        </td>\n" +
            "        <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></td>\n" +
            "    </tr>\n" +
            "</table>\n" +
            "<table style=\"margin-bottom: 15px; ;border-collapse: collapse; width:100%; ;margin-top: 13px;\"\n" +
            "       class=\"polarion-no-style-cleanup\">\n" +
            "    <tr>\n" +
            "        <th style=\"width: 80%; text-align: left; background-color: #ffffff;\">Test Case Verdict:</th>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td style=\"vertical-align: top;\"><span style=\"font-weight: bold;\"><span style=\"color: #C30000;\"><span\n" +
            "                title=\"Failed\"><span style=\"white-space:nowrap;\"><img\n" +
            "                src=\"/polarion/icons/default/enums/testrun_status_failed.png\"\n" +
            "                style=\"vertical-align:text-bottom;border:0px;margin-right:2px;\"\n" +
            "                class=\"polarion-no-style-cleanup\"/></span>Failed</span></span></span></td>\n" +
            "    </tr>\n" +
            "</table>";
}
