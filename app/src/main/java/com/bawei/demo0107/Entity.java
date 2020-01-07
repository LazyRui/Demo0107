package com.bawei.demo0107;

import java.util.List;

/**
 * ProjectName: Demo0107
 * PackageName: com.bawei.demo0107
 * ClassName:   Entity
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/1/7_8:44
 */
public class Entity {

    /**
     * result : [{"categoryName":"美妆护肤","shoppingCartList":[{"commodityId":5,"commodityName":"双头两用修容笔","count":3,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/3/1.jpg","price":39},{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","count":4,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg","price":39},{"commodityId":7,"commodityName":"蓝色之恋","count":44,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/5/1.jpg","price":29},{"commodityId":8,"commodityName":"Lara style蜜颊润泽腮红","count":34,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/6/1.jpg","price":19},{"commodityId":10,"commodityName":"BYPHASSE蓓昂丝温和清洁净肤保湿卸妆水","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/7/1.jpg","price":69},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6},{"commodityId":16,"commodityName":"Lara style清洗剂","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/6/1.jpg","price":12},{"commodityId":17,"commodityName":"化妆镜","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/7/1.jpg","price":31},{"commodityId":11,"commodityName":"盒装葫芦粉扑美妆蛋化妆海绵","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/1/1.jpg","price":9},{"commodityId":12,"commodityName":"Lara style美妆BB蛋","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/2/1.jpg","price":22},{"commodityId":13,"commodityName":"贝览得美妆蛋","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/3/1.jpg","price":44},{"commodityId":14,"commodityName":"美诺MENOW面部刷","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/4/1.jpg","price":47}]},{"categoryName":"女鞋","shoppingCartList":[{"commodityId":18,"commodityName":"白色经典 秋季新款简约百搭轻便休闲女鞋板鞋小白鞋","count":24,"pic":"http://172.17.8.100/images/small/commodity/nx/bx/1/1.jpg","price":79},{"commodityId":19,"commodityName":"环球 时尚拼色街拍百搭小白鞋 韩版原宿ulzzang板鞋 女休闲鞋","count":24,"pic":"http://172.17.8.100/images/small/commodity/nx/bx/2/1.jpg","price":78},{"commodityId":20,"commodityName":"环球 冬季休闲加绒保暖棉靴 韩版百搭学生小白鞋女士高帮棉鞋","count":24,"pic":"http://172.17.8.100/images/small/commodity/nx/bx/3/1.jpg","price":78},{"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","count":24,"pic":"http://172.17.8.100/images/small/commodity/nx/bx/4/1.jpg","price":189}]}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * categoryName : 美妆护肤
         * shoppingCartList : [{"commodityId":5,"commodityName":"双头两用修容笔","count":3,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/3/1.jpg","price":39},{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","count":4,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg","price":39},{"commodityId":7,"commodityName":"蓝色之恋","count":44,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/5/1.jpg","price":29},{"commodityId":8,"commodityName":"Lara style蜜颊润泽腮红","count":34,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/6/1.jpg","price":19},{"commodityId":10,"commodityName":"BYPHASSE蓓昂丝温和清洁净肤保湿卸妆水","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/7/1.jpg","price":69},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6},{"commodityId":16,"commodityName":"Lara style清洗剂","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/6/1.jpg","price":12},{"commodityId":17,"commodityName":"化妆镜","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/7/1.jpg","price":31},{"commodityId":11,"commodityName":"盒装葫芦粉扑美妆蛋化妆海绵","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/1/1.jpg","price":9},{"commodityId":12,"commodityName":"Lara style美妆BB蛋","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/2/1.jpg","price":22},{"commodityId":13,"commodityName":"贝览得美妆蛋","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/3/1.jpg","price":44},{"commodityId":14,"commodityName":"美诺MENOW面部刷","count":24,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/4/1.jpg","price":47}]
         */

        private String categoryName;
        private List<ShoppingCartListBean> shoppingCartList;
        private boolean isChecked = false;

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public List<ShoppingCartListBean> getShoppingCartList() {
            return shoppingCartList;
        }

        public void setShoppingCartList(List<ShoppingCartListBean> shoppingCartList) {
            this.shoppingCartList = shoppingCartList;
        }

        public static class ShoppingCartListBean {
            /**
             * commodityId : 5
             * commodityName : 双头两用修容笔
             * count : 3
             * pic : http://172.17.8.100/images/small/commodity/mzhf/cz/3/1.jpg
             * price : 39
             */

            private int commodityId;
            private String commodityName;
            private int count;
            private String pic;
            private int price;
            private boolean idChecked = false;

            public boolean isIdChecked() {
                return idChecked;
            }

            public void setIdChecked(boolean idChecked) {
                this.idChecked = idChecked;
            }

            public int getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(int commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }
    }
}
