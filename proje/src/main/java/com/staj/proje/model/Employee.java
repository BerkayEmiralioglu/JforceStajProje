    package com.staj.proje.model;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    import java.time.LocalDateTime;

    @Entity
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)


        private long id;
        private String ad;
        private String soyad;
        private String cinsiyet;
        private LocalDateTime doğumTarihi;
        private String medeniDurumu;
        private String tckn;
        private int sicilNumarası;
        private String mezuniyetDurumu;
        private String birim;
        private String görev;
        private boolean çalışıyorMu;
        private String profilFoto;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getAd() {
            return ad;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }

        public String getSoyad() {
            return soyad;
        }

        public void setSoyad(String soyad) {
            this.soyad = soyad;
        }

        public String getCinsiyet() {
            return cinsiyet;
        }

        public void setCinsiyet(String cinsiyet) {
            this.cinsiyet = cinsiyet;
        }

        public LocalDateTime getDoğumTarihi() {
            return doğumTarihi;
        }

        public void setDoğumTarihi(LocalDateTime doğumTarihi) {
            this.doğumTarihi = doğumTarihi;
        }

        public String getMedeniDurumu() {
            return medeniDurumu;
        }

        public void setMedeniDurumu(String medeniDurumu) {
            this.medeniDurumu = medeniDurumu;
        }

        public String getTckn() {
            return tckn;
        }

        public void setTckn(String tckn) {
            this.tckn = tckn;
        }

        public int getSicilNumarası() {
            return sicilNumarası;
        }

        public void setSicilNumarası(int sicilNumarası) {
            this.sicilNumarası = sicilNumarası;
        }

        public String getMezuniyetDurumu() {
            return mezuniyetDurumu;
        }

        public void setMezuniyetDurumu(String mezuniyetDurumu) {
            this.mezuniyetDurumu = mezuniyetDurumu;
        }

        public String getBirim() {
            return birim;
        }

        public void setBirim(String birim) {
            this.birim = birim;
        }

        public String getGörev() {
            return görev;
        }

        public void setGörev(String görev) {
            this.görev = görev;
        }

        public boolean isÇalışıyorMu() {
            return çalışıyorMu;
        }

        public void setÇalışıyorMu(boolean çalışıyorMu) {
            this.çalışıyorMu = çalışıyorMu;
        }

        public String getProfilFoto() {
            return profilFoto;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", ad='" + ad + '\'' +
                    ", soyad='" + soyad + '\'' +
                    ", cinsiyet='" + cinsiyet + '\'' +
                    ", doğumTarihi=" + doğumTarihi +
                    ", medeniDurumu='" + medeniDurumu + '\'' +
                    ", tckn='" + tckn + '\'' +
                    ", sicilNumarası=" + sicilNumarası +
                    ", mezuniyetDurumu='" + mezuniyetDurumu + '\'' +
                    ", birim='" + birim + '\'' +
                    ", görev='" + görev + '\'' +
                    ", çalışıyorMu=" + çalışıyorMu +
                    ", profilFoto='" + profilFoto + '\'' +
                    '}';
        }

        public void setProfilFoto(String profilFoto) {
            this.profilFoto = profilFoto;
        }
    }