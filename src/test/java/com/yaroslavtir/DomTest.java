package com.yaroslavtir;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class DomTest {

    @Test
    public void test() throws Exception {
        StringBuilder sb = new StringBuilder();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        InputStream stream = new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8));
        Document parse = dBuilder.parse(stream);
        NodeList nodes = parse.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if ("b".equals(node.getNodeName())){
                sb.append('*');
                sb.append(node.getTextContent());
                sb.append('*');
            } else if ("table".equals(node.getNodeName())){
                for (int j = 0; j < node.getChildNodes().getLength(); j++) {
                    Node node1 = node.getChildNodes().item(j);
                    if ("tr".equals(node1.getNodeName())){
                        for (int k = 0; k < node1.getChildNodes().getLength(); k++) {
                            Node node2 = node1.getChildNodes().item(k);
                            if ("th".equals(node2.getNodeName())){
                                sb.append('|');
                                sb.append(node2.getTextContent().replace("\n", ""));
                            } else if ("td".equals(node2.getNodeName())){
                                sb.append('|');
                                sb.append(node2.getTextContent().replace("\n", ""));
                            }
                        }
                        sb.append('|');
                        sb.append("\n");
                    }

                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static final String html = "<doc>\n" +
            "<b>Test Run:</b> <span id=\"link\" class=\"polarion-rte-link\" data-type=\"testRun\" data-item-id=\"hello world\"\n" +
            "                       data-option-id=\"long\"></span><br/><b>Test Case:</b> <span id=\"link\" class=\"polarion-rte-link\"\n" +
            "                                                                                 data-type=\"workItem\"\n" +
            "                                                                                 data-item-id=\"EL-3\"\n" +
            "                                                                                 data-option-id=\"long\"\n" +
            "                                                                                 data-revision=\"5591\"></span><br/>\n" +
            "<table class=\"polarion-no-style-cleanup\" style=\"border-collapse: collapse;\">\n" +
            "<tr style=\"text-align: left; white-space: nowrap; color: #757575; border-bottom: 1px solid #d2d7da; background-color: #ffffff;\">\n" +
            "    <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></th>\n" +
            "    <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">#</th>\n" +
            "    <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span title=\"Step\">Step</span>\n" +
            "    </th>\n" +
            "    <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "            title=\"Step Description\">Step Description</span></th>\n" +
            "    <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "            title=\"Expected Result\">Expected Result</span></th>\n" +
            "    <th style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">Actual Result</th>\n" +
            "</tr>\n" +
            "<tr style=\"border-bottom: 1px solid #f0f0f0;\">\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "            title=\"Passed\"><span style=\"white-space:nowrap;\"><img\n" +
            "            src=\"/polarion/icons/default/enums/testrun_status_passed.png\"\n" +
            "            style=\"vertical-align:text-bottom;border:0px;margin-right:2px;\"\n" +
            "            class=\"polarion-no-style-cleanup\"/></span></span></td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "        1\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "        Open User Account Page\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">Login to E-Library\n" +
            "        Portal, and click user name in top left corner\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">The user account\n" +
            "        page is shown\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></td>\n" +
            "</tr>\n" +
            "<tr style=\"border-bottom: 1px solid #f0f0f0;\">\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "            title=\"Passed\"><span style=\"white-space:nowrap;\"><img\n" +
            "            src=\"/polarion/icons/default/enums/testrun_status_passed.png\"\n" +
            "            style=\"vertical-align:text-bottom;border:0px;margin-right:2px;\"\n" +
            "            class=\"polarion-no-style-cleanup\"/></span></span></td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "        2\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "        Create new user\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">Click on &quot;Create\n" +
            "        new user&quot; link\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">The dialog to\n" +
            "        create a new user is shown\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></td>\n" +
            "</tr>\n" +
            "<tr style=\"border-bottom: 1px solid #f0f0f0;\">\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "            title=\"Passed\"><span style=\"white-space:nowrap;\"><img\n" +
            "            src=\"/polarion/icons/default/enums/testrun_status_passed.png\"\n" +
            "            style=\"vertical-align:text-bottom;border:0px;margin-right:2px;\"\n" +
            "            class=\"polarion-no-style-cleanup\"/></span></span></td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "        3\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "        Enter name with tab key\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">Type: foo\\tbar\n" +
            "        (where \\t is tab key)\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></td>\n" +
            "</tr>\n" +
            "<tr style=\"border-bottom: 1px solid #f0f0f0;\">\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"><span\n" +
            "            title=\"Failed\"><span style=\"white-space:nowrap;\"><img\n" +
            "            src=\"/polarion/icons/default/enums/testrun_status_failed.png\"\n" +
            "            style=\"vertical-align:text-bottom;border:0px;margin-right:2px;\"\n" +
            "            class=\"polarion-no-style-cleanup\"/></span></span></td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "        4\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;font-weight: bold;\">\n" +
            "        Save it\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">Click &quot;Search&quot;</td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\">System reports that\n" +
            "        the username cannot contain tab key\n" +
            "    </td>\n" +
            "    <td style=\"text-align: left; padding: 10px; vertical-align: top; background-color: #ffffff;\"></td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "<table style=\"margin-bottom: 15px; ;border-collapse: collapse; width:100%; ;margin-top: 13px;\"\n" +
            "       class=\"polarion-no-style-cleanup\">\n" +
            "<tr>\n" +
            "    <th style=\"width: 80%; text-align: left; background-color: #ffffff;\">Test Case Verdict:</th>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td style=\"vertical-align: top;\"><span style=\"font-weight: bold;\"><span style=\"color: #C30000;\"><span\n" +
            "            title=\"Failed\"><span style=\"white-space:nowrap;\"><img\n" +
            "            src=\"/polarion/icons/default/enums/testrun_status_failed.png\"\n" +
            "            style=\"vertical-align:text-bottom;border:0px;margin-right:2px;\"\n" +
            "            class=\"polarion-no-style-cleanup\"/></span>Failed</span></span></span></td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "</doc>";
}
