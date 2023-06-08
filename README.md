# CalculadoraOperacionesBasicas
¡Hola a todos! 

En esta presentación, les mostraremos nuestro emocionante proyecto: 
Un repositorio dedicado a una calculadora con la implementacion de un widget para las operaciones de suma,resta,multiplicación y division.

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@drawable/icono"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.AppCalculadora"
        tools:targetApi="31">
        <activity
            android:name=".calculadora"
            android:exported="false" />
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>


![image](https://github.com/Lesli16/CalculadoraOperacionesBasicas/assets/133244295/58babe73-e26b-4cf7-9459-add7990876f8)



# CODE activity_main

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#00FFAB40"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/text"
        android:layout_width="160dp"
        android:layout_height="24dp"
        android:autoSizeTextType="uniform"
        android:background="#37D17192"
        android:freezesText="false"
        android:text="PARDO NAYDELIN"
        android:textColorLink="#1C1717"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.501"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.16" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:autoSizeTextType="uniform"
        android:background="#090807"
        android:backgroundTint="#2EB6B6"
        android:elegantTextHeight="true"
        android:freezesText="false"
        android:text="UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE"
        android:textColorLink="#100B0B"
        android:textIsSelectable="false"
        android:textSize="16sp"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.491"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/inicio"
        android:layout_width="130dp"
        android:layout_height="68dp"
        android:layout_marginBottom="96dp"
        android:background="#B5164C"
        android:backgroundTint="#1D2F95"
        android:text="Inicio"
        android:textColorLink="#227FA8"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.466"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/tv"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FF6E40"
        android:text="Integrantes:"
        android:textColorLink="#130E0E"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.102" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="163dp"
        android:layout_height="23dp"
        android:autoSizeTextType="uniform"
        android:background="#23D6638A"
        android:freezesText="false"
        android:text="LLANGO LESLI"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.503"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.217" />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="322dp"
        android:layout_height="311dp"
        android:background="#FFAB40"
        app:layout_constraintBottom_toTopOf="@+id/inicio"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView3"
        app:layout_constraintVertical_bias="0.5"
        app:srcCompat="@drawable/logo_espe" />

    <androidx.constraintlayout.widget.Group
        android:id="@+id/group"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:constraint_referenced_ids="imageView3" />

</androidx.constraintlayout.widget.ConstraintLayout>


![image](https://github.com/Lesli16/CalculadoraOperacionesBasicas/assets/133244295/17bd6077-648f-4744-b957-80da50153b7f)

# EJECUCIÓN

![image](https://github.com/Lesli16/CalculadoraOperacionesBasicas/assets/133244295/aa97c095-0760-445f-a379-18621e24b736)



