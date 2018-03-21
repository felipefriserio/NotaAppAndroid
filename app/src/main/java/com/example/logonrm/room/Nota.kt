package com.example.logonrm.room

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "nota")
data class Nota(

        @PrimaryKey(autoGenerate = true)
        var id: Int?,

        @ColumnInfo(name = "descricao")
        var descricao: String){
    constructor() : this(null ,"")
}