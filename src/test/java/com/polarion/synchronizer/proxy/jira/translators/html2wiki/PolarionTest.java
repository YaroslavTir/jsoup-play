package com.polarion.synchronizer.proxy.jira.translators.html2wiki;


import junit.framework.Assert;
import org.junit.Test;

public class PolarionTest {

    @Test
    public void test() throws Exception {
            long start = System.currentTimeMillis();
            HTML2JiraWikiConverter converter = new HTML2JiraWikiConverter(new TagContainer(), "http://test.com");
            String result = converter.convert(html6);
//            System.out.println(converter.convert(html6));
//            System.out.println(converter.convert(html6));
//            System.out.println(converter.convert(html6));
//            System.out.println(converter.convert(html6));
//            System.out.println(converter.convert(html6));
//            System.out.println(converter.convert(html6));
//            System.out.println(converter.convert(html6));
//            System.out.println(converter.convert(html6));
            System.out.println(result);
            System.out.println(System.currentTimeMillis() - start);
            Assert.assertNotNull(result);
    }

        public static final String html1 =
                "<table style=\"border-collapse: collapse;\">\n" +
                        "    <tbody>\n" +
                        "    <tr style=\"color: #757575;\">\n" +
                        "        <th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"></th>\n" +
                        "        <th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">#</th>\n" +
                        "        <th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Step</th>\n" +
                        "        <th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Step Description</th>\n" +
                        "        <th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Expected Result</th>\n" +
                        "        <th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Actual Result</th>\n" +
                        "    </tr>\n" +
                        "    </tbody>\n" +
                        "    </table>";

        public static final String html5 = " <tr style=\"font-weight: bold;\" >head1</tr>\n";
        public static final String html6 =
                "<table><tbody><tr><th style=\"font-weight: bold;\" >head1</th></tr></tbody></table>";

    public static final String html2 = "<br/>" +
            "<table>\n" +
            "    <tbody>\n" +
            "    <tr>\n" +
            "        <th style=\"color: #757575\">noting</th>\n" +
            "        <th style=\"font-weight: bold;\" >head1</th>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td>a<img/></td>\n" +
            "        <td> 1</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "        <td>b<img/></td>\n" +
            "        <td>2</td>\n" +
            "    </tr>\n" +
            "    </tbody>\n" +
            "</table>\n";




        public static final String html4 = "<table id=\"polarion_wiki macro name=table;params=width=38.37%\" class=\"polarion-Document-table\"\n" +
                "       style=\"width: 38.37%;margin-left: auto;margin-right: auto;border: 1px solid #CCCCCC;empty-cells: show;border-collapse: collapse;\">\n" +
                "    <tbody>\n" +
                "    <tr>\n" +
                "        <th style=\"font-weight: bold;background-color: #F0F0F0;text-align: left;vertical-align: top;width: 252px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">\n" +
                "            h1\n" +
                "        </th>\n" +
                "        <th style=\"font-weight: bold;background-color: #F0F0F0;text-align: left;vertical-align: top;width: 274px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">\n" +
                "            h2\n" +
                "        </th>\n" +
                "        <th style=\"font-weight: bold;background-color: #F0F0F0;text-align: left;vertical-align: top;width: 292px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">\n" +
                "            h2\n" +
                "        </th>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td style=\"text-align: left;vertical-align: top;width: 252px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">\n" +
                "            dsfsdf\n" +
                "        </td>\n" +
                "        <td style=\"text-align: left;vertical-align: top;width: 274px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">\n" +
                "            vcbcvb\n" +
                "        </td>\n" +
                "        <td style=\"text-align: left;vertical-align: top;width: 292px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">\n" +
                "            uuiyuiy\n" +
                "        </td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td style=\"text-align: left;vertical-align: top;width: 252px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">\n" +
                "            ddd\n" +
                "        </td>\n" +
                "        <td style=\"text-align: left;vertical-align: top;width: 274px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">\n" +
                "            bbb\n" +
                "        </td>\n" +
                "        <td style=\"text-align: left;vertical-align: top;width: 292px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">\n" +
                "            ggg\n" +
                "        </td>\n" +
                "    </tr>\n" +
                "    </tbody>\n" +
                "</table>";

        public static final String html3 = "<span style=\"font-weight: bold;\">Test Run:</span>\n" +
                "<span class=\"polarion-rte-link\" data-type=\"testRun\" id=\"fake\" data-item-id=\"hello world\" data-option-id=\"long\"></span><br>\n" +
                "<span style=\"font-weight: bold;\">Test Case:</span> \n" +
                "<span class=\"polarion-rte-link\" data-type=\"workItem\" id=\"fake\" data-item-id=\"EL-3\" data-option-id=\"long\" data-revision=\"5591\"></span><br>\n" +
                "<table style=\"border-collapse: collapse;\">\n" +
                "<tbody>\n" +
                "<tr style=\"color: #757575;\"><th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"></th><th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">#</th><th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Step</th><th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Step Description</th><th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Expected Result</th><th style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Actual Result</th></tr>\n" +
                "<tr><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"><img src=\"/polarion/icons/default/enums/testrun_status_passed.png\" style=\"margin-right: 2px;border: 0px;\"></td><td style=\"font-weight: bold;background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">1</td><td style=\"font-weight: bold;background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Open User Account Page</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Login to E-Library Portal, and click user name in top left corner</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">The user account page is shown</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"></td></tr>\n" +
                "<tr><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"><img src=\"/polarion/icons/default/enums/testrun_status_passed.png\" style=\"margin-right: 2px;border: 0px;\"></td><td style=\"font-weight: bold;background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">2</td><td style=\"font-weight: bold;background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Create new user</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Click on \"Create new user\" link</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">The dialog to create a new user is shown</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"></td></tr>\n" +
                "<tr><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"><img src=\"/polarion/icons/default/enums/testrun_status_passed.png\" style=\"margin-right: 2px;border: 0px;\"></td><td style=\"font-weight: bold;background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">3</td><td style=\"font-weight: bold;background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Enter name with tab key</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Type: foo\\tbar (where \\t is tab key)</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"></td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"></td></tr>\n" +
                "<tr><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"><IMG src=\"/polarion/icons/default/enums/testrun_status_failed.png\" style=\"margin-right: 2px;border: 0px;\"></td><td style=\"font-weight: bold;background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">4</td><td style=\"font-weight: bold;background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Save it</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">Click \"Search\"</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\">System reports that the username cannot contain tab key</td><td style=\"background-color: #FFFFFF;text-align: left;vertical-align: top;padding: 10px;\"></td></tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "<table style=\"width: 100%;border-collapse: collapse;\"><tbody><tr><th style=\"background-color: #FFFFFF;text-align: left;width: 80%;\">Test Case Verdict:</th></tr><tr><td style=\"vertical-align: top;\"><span style=\"font-weight: bold;color: #C30000;\"><img src=\"/polarion/icons/default/enums/testrun_status_failed.png\" style=\"margin-right: 2px;border: 0px;\">Failed</span></td></tr></tbody></table><br>\n" +
                "<table id=\"polarion_wiki macro name=table;params=width=38.37%\" class=\"polarion-Document-table\" style=\"width: 38.37%;margin-left: auto;margin-right: auto;border: 1px solid #CCCCCC;empty-cells: show;border-collapse: collapse;\"><tbody><tr><th style=\"font-weight: bold;background-color: #F0F0F0;text-align: left;vertical-align: top;width: 252px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">h1</th><th style=\"font-weight: bold;background-color: #F0F0F0;text-align: left;vertical-align: top;width: 274px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">h2</th><th style=\"font-weight: bold;background-color: #F0F0F0;text-align: left;vertical-align: top;width: 292px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">h2</th></tr><tr><td style=\"text-align: left;vertical-align: top;width: 252px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">dsfsdf</td><td style=\"text-align: left;vertical-align: top;width: 274px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">vcbcvb</td><td style=\"text-align: left;vertical-align: top;width: 292px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">uuiyuiy</td></tr><tr><td style=\"text-align: left;vertical-align: top;width: 252px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">ddd</td><td style=\"text-align: left;vertical-align: top;width: 274px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">bbb</td><td style=\"text-align: left;vertical-align: top;width: 292px;height: 12px;border: 1px solid #CCCCCC;padding: 5px;\">ggg</td></tr></tbody></table><br> <br>\n" +
                "<span style=\"font-style: italic;\">some text12</span>";

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
