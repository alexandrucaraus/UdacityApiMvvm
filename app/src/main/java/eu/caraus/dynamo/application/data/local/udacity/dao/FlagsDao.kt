package eu.caraus.dynamo.application.data.local.udacity.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import eu.caraus.dynamo.application.data.domain.udacity.Flags
import io.reactivex.Flowable


@Dao
interface FlagsDao {

    @Insert( onConflict = OnConflictStrategy.REPLACE)
    fun upsertAll( item : Flags )

    @Query( "SELECT * FROM flags" )
    fun getAll() : Flowable<Flags>

}