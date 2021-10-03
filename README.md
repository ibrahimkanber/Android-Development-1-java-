# Android-Development-1-java-
try {
                Cursor cursor=database.rawQuery("SELECT * from arts WHERE id=?",new String[] {String.valueOf(artId)});
                int artNameIndex=cursor.getColumnIndex("artname");
                int painterNameIndex=cursor.getColumnIndex("paintername");
                int yearIndex=cursor.getColumnIndex("year");
                int imageIndex=cursor.getColumnIndex("image");

                while(cursor.moveToNext()){
                    binding.nameText.setText(cursor.getString(artNameIndex));
                    binding.artistText.setText(cursor.getString(painterNameIndex));
                    binding.yearText.setText(cursor.getString(yearIndex));
                    byte[] bytes=cursor.getBlob(imageIndex);
                    Bitmap bitmap= BitmapFactory.decodeByteArray(bytes,0,bytes.length);
                    binding.imageView.setImageBitmap(bitmap);
                }
                cursor.close();
