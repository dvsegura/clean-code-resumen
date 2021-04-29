//3.2 HtmlUtil.java
public static String rederPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite)
    throw Exception {
        boolean isTestPage = pageData.hasAttribute("test");
        if(isTestPage){
            Wiki testPage =pageData.getWikiPage();
            //
            //
            //
            //
            //
        }
        return pageData.getHtml();
    }
