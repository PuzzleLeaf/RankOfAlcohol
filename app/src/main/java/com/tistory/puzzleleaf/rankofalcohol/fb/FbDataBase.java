package com.tistory.puzzleleaf.rankofalcohol.fb;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by cmtyx on 2017-07-27.
 */

public class FbDataBase {
    public static FirebaseDatabase database = FirebaseDatabase.getInstance();

    public static int userReviewCount = 0;

}
