package uts.sttindonesia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uts.sttindonesia.PembelianModel;

@SpringBootApplication
@Controller
public class PembelianController {
    public static void main(String[] args) {
        SpringApplication.run(PembelianController.class, args);
    }

    @GetMapping("/")
    public String index(Model model) {
        
        PembelianModel pembelian = new PembelianModel();
        model.addAttribute("pembelian", pembelian);
        return "index";
    }

    @PostMapping("/bukti-pembayaran")
    public String buktiPembayaran(@ModelAttribute("pembelian") PembelianModel pembelian) {
        double total = 0;
        int jumlah = pembelian.getJumlahBeli();
        String kode = pembelian.getKodePesanan();
        double bayar = pembelian.getUangBayar();
        int potongan = 0;

        if (kode.equals("TAKA-1")){
            potongan = (jumlah * 40000) * 20/100;
            total = (jumlah * 40000);
            pembelian.setNamaPesanan("Kacang Hijau Bollen");
            pembelian.setHarga(40000);
        }
        else if(kode.equals("TAKA-2")){
            total = (jumlah * 50000);
            pembelian.setNamaPesanan("Apel Bollen");
            pembelian.setHarga(50000);
        }
        else if(kode.equals("TAKA-3")){
            potongan = (jumlah * 40000) * 10/100;
            total = (jumlah * 40000);
            pembelian.setNamaPesanan("Peyeum Keju Bollen");
            pembelian.setHarga(60000);
        }
        else {
            total = (jumlah * 70000);
            pembelian.setNamaPesanan("Durian Keju Bollen");
            pembelian.setHarga(70000);
        }
        pembelian.setUangBayar(bayar);
        pembelian.setUangKembali(bayar - total);
        pembelian.setPotongan(potongan);
        pembelian.setTotal(total - potongan);
        pembelian.setTotalKeseluruhan(total);
        return "bukti-pembayaran";
    }
}
