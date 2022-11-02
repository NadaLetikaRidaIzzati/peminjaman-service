/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nada.peminjaman.VO;
import com.nada.peminjaman.entity.Peminjaman;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author nadaletika
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
     private Peminjaman peminjaman;
    private Anggota anggota;
}
