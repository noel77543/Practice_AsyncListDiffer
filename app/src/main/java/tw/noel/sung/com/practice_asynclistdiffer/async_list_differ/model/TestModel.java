package tw.noel.sung.com.practice_asynclistdiffer.async_list_differ.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import tw.noel.sung.com.practice_asynclistdiffer.async_list_differ.base.BaseAsyncListDifferModel;

public class TestModel {


    @SerializedName("datas")
    private ArrayList<DatasBean> datas;

    public ArrayList<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(ArrayList<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean implements BaseAsyncListDifferModel {
        /**
         * PharmacyPhone : (07)3652334
         * KidMaskCounts : 630
         * PharmacyAddress : 高雄市楠梓區德賢路２０２號
         * AdultMaskCounts : 1
         * RND : 627811
         * PharmacyNo : 5902040229
         * Latitude : 22.72684620
         * PharmacyName : 進昇藥局
         * Longitude : 120.30672750
         * update_date : 2020-03-23 16:11:43
         */

        @SerializedName("PharmacyPhone")
        private String PharmacyPhone;
        @SerializedName("KidMaskCounts")
        private String KidMaskCounts;
        @SerializedName("PharmacyAddress")
        private String PharmacyAddress;
        @SerializedName("AdultMaskCounts")
        private String AdultMaskCounts;
        @SerializedName("RND")
        private String RND;
        @SerializedName("PharmacyNo")
        private String PharmacyNo;
        @SerializedName("Latitude")
        private String Latitude;
        @SerializedName("PharmacyName")
        private String PharmacyName;
        @SerializedName("Longitude")
        private String Longitude;
        @SerializedName("update_date")
        private String updateDate;

        public String getPharmacyPhone() {
            return PharmacyPhone;
        }

        public void setPharmacyPhone(String PharmacyPhone) {
            this.PharmacyPhone = PharmacyPhone;
        }

        public String getKidMaskCounts() {
            return KidMaskCounts;
        }

        public void setKidMaskCounts(String KidMaskCounts) {
            this.KidMaskCounts = KidMaskCounts;
        }

        public String getPharmacyAddress() {
            return PharmacyAddress;
        }

        public void setPharmacyAddress(String PharmacyAddress) {
            this.PharmacyAddress = PharmacyAddress;
        }

        public String getAdultMaskCounts() {
            return AdultMaskCounts;
        }

        public void setAdultMaskCounts(String AdultMaskCounts) {
            this.AdultMaskCounts = AdultMaskCounts;
        }

        public String getRND() {
            return RND;
        }

        public void setRND(String RND) {
            this.RND = RND;
        }

        public String getPharmacyNo() {
            return PharmacyNo;
        }

        public void setPharmacyNo(String PharmacyNo) {
            this.PharmacyNo = PharmacyNo;
        }

        public String getLatitude() {
            return Latitude;
        }

        public void setLatitude(String Latitude) {
            this.Latitude = Latitude;
        }

        public String getPharmacyName() {
            return PharmacyName;
        }

        public void setPharmacyName(String PharmacyName) {
            this.PharmacyName = PharmacyName;
        }

        public String getLongitude() {
            return Longitude;
        }

        public void setLongitude(String Longitude) {
            this.Longitude = Longitude;
        }

        public String getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
        }

        @Override
        public String getObjectName() {
            return getPharmacyName();
        }

        @Override
        public String getObjectId() {
            return getPharmacyNo();
        }
    }
}
