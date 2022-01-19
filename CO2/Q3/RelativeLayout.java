<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <RelativeLayout
        android:id="@+id/relativeLayout"
        android:layout_width="462dp"
        android:layout_height="184dp"
        tools:layout_editor_absoluteX="1dp"
        tools:layout_editor_absoluteY="1dp">

        <ImageView
            android:id="@+id/imageView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:srcCompat="@drawable/facebook_2019" />
    </RelativeLayout>

    <EditText
        android:id="@+id/editTextTextPersonName"
        android:layout_width="443dp"
        android:layout_height="73dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Email or phone"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/relativeLayout"
        app:layout_constraintVertical_bias="0.0" />

    <EditText
        android:id="@+id/editTextTextPersonName2"
        android:layout_width="448dp"
        android:layout_height="59dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Password"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.714"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.402" />

    <Button
        android:id="@+id/button"
        android:layout_width="460dp"
        android:layout_height="70dp"
        android:text="login"
        app:iconTint="#6A1111"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.777"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.56" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="131dp"
        android:layout_height="22dp"
        android:text="forgot password?"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@+id/relativeLayout"
        app:layout_constraintVertical_bias="0.675" />

</androidx.constraintlayout.widget.ConstraintLayout>