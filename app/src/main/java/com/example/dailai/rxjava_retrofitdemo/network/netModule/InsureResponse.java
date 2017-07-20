package com.example.dailai.rxjava_retrofitdemo.network.netModule;

import java.util.List;

/**
 * Created by dailai on 2017/7/20.
 */

public class InsureResponse {


    @Override
    public String toString() {
        return "InsureResponse{" +
                "pageCount='" + pageCount + '\'' +
                ", pageMixSize='" + pageMixSize + '\'' +
                ", pageMaxSize='" + pageMaxSize + '\'' +
                ", rowCount='" + rowCount + '\'' +
                ", Msg='" + Msg + '\'' +
                ", State='" + State + '\'' +
                ", ProductList=" + ProductList +
                '}';
    }

    /**
     * ProductList : [{"productId":"CBE15110-1B81-4045-8F83-464F10F1164B","productName":"保险产品1","pPhoto":"CBE15110-1B81-4045-8F83-464F10F1164B.png","remarks":"1111111111111111111111","money":"222","mixNumber":"20000","deductible":"10000","productType":"主险","guaranteeYear":"0","collectionId":"CBE15110-1B81-4045-8F83-464F10F1164B"},{"productId":"14DC0FA8-BBB7-4677-B564-D74D25A11BA9","productName":"保险产品3","pPhoto":"14DC0FA8-BBB7-4677-B564-D74D25A11BA9.png","remarks":"33333333333333333","money":"222","mixNumber":"80000","deductible":"10000","productType":"主险","guaranteeYear":"0","collectionId":""},{"productId":"EC61FC84-6B25-4F9B-91AA-BB58272F1555","productName":"保险产品2","pPhoto":"EC61FC84-6B25-4F9B-91AA-BB58272F1555.png","remarks":"22222222222","money":"222","mixNumber":"40000","deductible":"10000","productType":"主险","guaranteeYear":"0","collectionId":"EC61FC84-6B25-4F9B-91AA-BB58272F1555"}]
     * pageCount : 1
     * pageMixSize : 1
     * pageMaxSize : 10
     * rowCount : 3
     * Msg : 数据正常
     * State : 1
     */

    private String pageCount;
    private String pageMixSize;
    private String pageMaxSize;
    private String rowCount;
    private String Msg;
    private String State;
    private List<ProductListBean> ProductList;

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public String getPageMixSize() {
        return pageMixSize;
    }

    public void setPageMixSize(String pageMixSize) {
        this.pageMixSize = pageMixSize;
    }

    public String getPageMaxSize() {
        return pageMaxSize;
    }

    public void setPageMaxSize(String pageMaxSize) {
        this.pageMaxSize = pageMaxSize;
    }

    public String getRowCount() {
        return rowCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public List<ProductListBean> getProductList() {
        return ProductList;
    }

    public void setProductList(List<ProductListBean> ProductList) {
        this.ProductList = ProductList;
    }

    public static class ProductListBean {
        /**
         * productId : CBE15110-1B81-4045-8F83-464F10F1164B
         * productName : 保险产品1
         * pPhoto : CBE15110-1B81-4045-8F83-464F10F1164B.png
         * remarks : 1111111111111111111111
         * money : 222
         * mixNumber : 20000
         * deductible : 10000
         * productType : 主险
         * guaranteeYear : 0
         * collectionId : CBE15110-1B81-4045-8F83-464F10F1164B
         */

        private String productId;
        private String productName;
        private String pPhoto;
        private String remarks;
        private String money;
        private String mixNumber;
        private String deductible;
        private String productType;
        private String guaranteeYear;
        private String collectionId;

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getPPhoto() {
            return pPhoto;
        }

        public void setPPhoto(String pPhoto) {
            this.pPhoto = pPhoto;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public String getMixNumber() {
            return mixNumber;
        }

        public void setMixNumber(String mixNumber) {
            this.mixNumber = mixNumber;
        }

        public String getDeductible() {
            return deductible;
        }

        public void setDeductible(String deductible) {
            this.deductible = deductible;
        }

        public String getProductType() {
            return productType;
        }

        public void setProductType(String productType) {
            this.productType = productType;
        }

        public String getGuaranteeYear() {
            return guaranteeYear;
        }

        public void setGuaranteeYear(String guaranteeYear) {
            this.guaranteeYear = guaranteeYear;
        }

        public String getCollectionId() {
            return collectionId;
        }

        public void setCollectionId(String collectionId) {
            this.collectionId = collectionId;
        }
    }
}
