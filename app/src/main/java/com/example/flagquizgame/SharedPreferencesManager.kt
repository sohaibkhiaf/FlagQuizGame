package com.example.flagquizgame

import android.content.Context
import kotlin.random.Random

class SharedPreferencesManager (context: Context) {

    private val totalCountries : Int = 193

    private val preferences = context.getSharedPreferences("countries",
        Context.MODE_PRIVATE)

    fun initializeCountries() {
        val editor = preferences.edit()

        // Afghanistan
        editor.putString("name_1", "Afghanistan")
        editor.putString("code_1", "AF")
        editor.putString("flag_1", "flag_afghanistan")
        editor.putString("area_1", "652,230 km²")
        editor.putString("population_1", "41 million people")

        // Albania
        editor.putString("name_2", "Albania")
        editor.putString("code_2", "AL")
        editor.putString("flag_2", "flag_albania")
        editor.putString("area_2", "28,748 km²")
        editor.putString("population_2", "2.8 million people")

        // Algeria
        editor.putString("name_3", "Algeria")
        editor.putString("code_3", "DZ")
        editor.putString("flag_3", "flag_algeria")
        editor.putString("area_3", "2.382 million km²")
        editor.putString("population_3", "47.7 million people")

        // Andorra
        editor.putString("name_4", "Andorra")
        editor.putString("code_4", "AD")
        editor.putString("flag_4", "flag_andorra")
        editor.putString("area_4", "468 km²")
        editor.putString("population_4", "77 thousand people")

        // Angola
        editor.putString("name_5", "Angola")
        editor.putString("code_5", "AO")
        editor.putString("flag_5", "flag_angola")
        editor.putString("area_5", "1.246 million km²")
        editor.putString("population_5", "36 million people")

        // Antigua and Barbuda
        editor.putString("name_6", "Antigua and Barbuda")
        editor.putString("code_6", "AG")
        editor.putString("flag_6", "flag_antigua_and_barbuda")
        editor.putString("area_6", "442 km²")
        editor.putString("population_6", "93 thousand people")

        // Argentina
        editor.putString("name_7", "Argentina")
        editor.putString("code_7", "AR")
        editor.putString("flag_7", "flag_argentina")
        editor.putString("area_7", "2.780 million km²")
        editor.putString("population_7", "46 million people")

        // Armenia
        editor.putString("name_8", "Armenia")
        editor.putString("code_8", "AM")
        editor.putString("flag_8", "flag_armenia")
        editor.putString("area_8", "29,743 km²")
        editor.putString("population_8", "3 million people")

        // Australia
        editor.putString("name_9", "Australia")
        editor.putString("code_9", "AU")
        editor.putString("flag_9", "flag_australia")
        editor.putString("area_9", "7.692 million km²")
        editor.putString("population_9", "26 million people")

        // Austria
        editor.putString("name_10", "Austria")
        editor.putString("code_10", "AT")
        editor.putString("flag_10", "flag_austria")
        editor.putString("area_10", "83,879 km²")
        editor.putString("population_10", "9.1 million people")


        // Azerbaijan
        editor.putString("name_11", "Azerbaijan")
        editor.putString("code_11", "AZ")
        editor.putString("flag_11", "flag_azerbaijan")
        editor.putString("area_11", "86,600 km²")
        editor.putString("population_11", "10.3 million people")

        // Bahamas
        editor.putString("name_12", "Bahamas")
        editor.putString("code_12", "BS")
        editor.putString("flag_12", "flag_bahamas")
        editor.putString("area_12", "13,880 km²")
        editor.putString("population_12", "400 thousand people")

        // Bahrain
        editor.putString("name_13", "Bahrain")
        editor.putString("code_13", "BH")
        editor.putString("flag_13", "flag_bahrain")
        editor.putString("area_13", "778 km²")
        editor.putString("population_13", "1.5 million people")

        // Bangladesh
        editor.putString("name_14", "Bangladesh")
        editor.putString("code_14", "BD")
        editor.putString("flag_14", "flag_bangladesh")
        editor.putString("area_14", "148,460 km²")
        editor.putString("population_14", "173 million people")

        // Barbados
        editor.putString("name_15", "Barbados")
        editor.putString("code_15", "BB")
        editor.putString("flag_15", "flag_barbados")
        editor.putString("area_15", "430 km²")
        editor.putString("population_15", "281 thousand people")

        // Belarus
        editor.putString("name_16", "Belarus")
        editor.putString("code_16", "BY")
        editor.putString("flag_16", "flag_belarus")
        editor.putString("area_16", "207,600 km²")
        editor.putString("population_16", "9.2 million people")

        // Belgium
        editor.putString("name_17", "Belgium")
        editor.putString("code_17", "BE")
        editor.putString("flag_17", "flag_belgium")
        editor.putString("area_17", "30,528 km²")
        editor.putString("population_17", "11.7 million people")

        // Belize
        editor.putString("name_18", "Belize")
        editor.putString("code_18", "BZ")
        editor.putString("flag_18", "flag_belize")
        editor.putString("area_18", "22,966 km²")
        editor.putString("population_18", "420 thousand people")

        // Benin
        editor.putString("name_19", "Benin")
        editor.putString("code_19", "BJ")
        editor.putString("flag_19", "flag_benin")
        editor.putString("area_19", "114,763 km²")
        editor.putString("population_19", "13.5 million people")

        // Bhutan
        editor.putString("name_20", "Bhutan")
        editor.putString("code_20", "BT")
        editor.putString("flag_20", "flag_bhutan")
        editor.putString("area_20", "38,394 km²")
        editor.putString("population_20", "790 thousand people")

        // Bolivia
        editor.putString("name_21", "Bolivia")
        editor.putString("code_21", "BO")
        editor.putString("flag_21", "flag_bolivia")
        editor.putString("area_21", "1.099 million km²")
        editor.putString("population_21", "12.4 million people")

        // Bosnia and Herzegovina
        editor.putString("name_22", "Bosnia and Herzegovina")
        editor.putString("code_22", "BA")
        editor.putString("flag_22", "flag_bosnia_and_herzegovina")
        editor.putString("area_22", "51,209 km²")
        editor.putString("population_22", "3.2 million people")

        // Botswana
        editor.putString("name_23", "Botswana")
        editor.putString("code_23", "BW")
        editor.putString("flag_23", "flag_botswana")
        editor.putString("area_23", "581,730 km²")
        editor.putString("population_23", "2.6 million people")

        // Brazil
        editor.putString("name_24", "Brazil")
        editor.putString("code_24", "BR")
        editor.putString("flag_24", "flag_brazil")
        editor.putString("area_24", "8.516 million km²")
        editor.putString("population_24", "216 million people")

        // Brunei
        editor.putString("name_25", "Brunei")
        editor.putString("code_25", "BN")
        editor.putString("flag_25", "flag_brunei")
        editor.putString("area_25", "5,765 km²")
        editor.putString("population_25", "450 thousand people")

        // Bulgaria
        editor.putString("name_26", "Bulgaria")
        editor.putString("code_26", "BG")
        editor.putString("flag_26", "flag_bulgaria")
        editor.putString("area_26", "110,879 km²")
        editor.putString("population_26", "6.4 million people")

        // Burkina Faso
        editor.putString("name_27", "Burkina Faso")
        editor.putString("code_27", "BF")
        editor.putString("flag_27", "flag_burkina_faso")
        editor.putString("area_27", "272,967 km²")
        editor.putString("population_27", "23 million people")

        // Burundi
        editor.putString("name_28", "Burundi")
        editor.putString("code_28", "BI")
        editor.putString("flag_28", "flag_burundi")
        editor.putString("area_28", "27,834 km²")
        editor.putString("population_28", "13 million people")

        // Cambodia
        editor.putString("name_29", "Cambodia")
        editor.putString("code_29", "KH")
        editor.putString("flag_29", "flag_cambodia")
        editor.putString("area_29", "181,035 km²")
        editor.putString("population_29", "17 million people")

        // Cameroon
        editor.putString("name_30", "Cameroon")
        editor.putString("code_30", "CM")
        editor.putString("flag_30", "flag_cameroon")
        editor.putString("area_30", "475,442 km²")
        editor.putString("population_30", "28 million people")

        // Canada
        editor.putString("name_31", "Canada")
        editor.putString("code_31", "CA")
        editor.putString("flag_31", "flag_canada")
        editor.putString("area_31", "9.985 million km²")
        editor.putString("population_31", "40 million people")

        // Central African Republic
        editor.putString("name_32", "Central African Republic")
        editor.putString("code_32", "CF")
        editor.putString("flag_32", "flag_central_african_republic")
        editor.putString("area_32", "622,984 km²")
        editor.putString("population_32", "5.6 million people")

        // Chad
        editor.putString("name_33", "Chad")
        editor.putString("code_33", "TD")
        editor.putString("flag_33", "flag_chad")
        editor.putString("area_33", "1.284 million km²")
        editor.putString("population_33", "18 million people")

        // Chile
        editor.putString("name_34", "Chile")
        editor.putString("code_34", "CL")
        editor.putString("flag_34", "flag_chile")
        editor.putString("area_34", "756,102 km²")
        editor.putString("population_34", "19.6 million people")

        // China
        editor.putString("name_35", "China")
        editor.putString("code_35", "CN")
        editor.putString("flag_35", "flag_china")
        editor.putString("area_35", "9.597 million km²")
        editor.putString("population_35", "1.41 billion people")

        // Colombia
        editor.putString("name_36", "Colombia")
        editor.putString("code_36", "CO")
        editor.putString("flag_36", "flag_colombia")
        editor.putString("area_36", "1.142 million km²")
        editor.putString("population_36", "52 million people")

        // Comoros
        editor.putString("name_37", "Comoros")
        editor.putString("code_37", "KM")
        editor.putString("flag_37", "flag_comoros")
        editor.putString("area_37", "2,235 km²")
        editor.putString("population_37", "850 thousand people")

        // Congo (Republic of the)
        editor.putString("name_38", "Congo")
        editor.putString("code_38", "CG")
        editor.putString("flag_38", "flag_congo")
        editor.putString("area_38", "342,000 km²")
        editor.putString("population_38", "6 million people")

        // Costa Rica
        editor.putString("name_39", "Costa Rica")
        editor.putString("code_39", "CR")
        editor.putString("flag_39", "flag_costa_rica")
        editor.putString("area_39", "51,100 km²")
        editor.putString("population_39", "5.2 million people")

        // Croatia
        editor.putString("name_40", "Croatia")
        editor.putString("code_40", "HR")
        editor.putString("flag_40", "flag_croatia")
        editor.putString("area_40", "56,594 km²")
        editor.putString("population_40", "3.9 million people")

        // Cuba
        editor.putString("name_41", "Cuba")
        editor.putString("code_41", "CU")
        editor.putString("flag_41", "flag_cuba")
        editor.putString("area_41", "109,884 km²")
        editor.putString("population_41", "11 million people")

        // Cyprus
        editor.putString("name_42", "Cyprus")
        editor.putString("code_42", "CY")
        editor.putString("flag_42", "flag_cyprus")
        editor.putString("area_42", "9,251 km²")
        editor.putString("population_42", "1.3 million people")

        // Czech Republic
        editor.putString("name_43", "Czech Republic")
        editor.putString("code_43", "CZ")
        editor.putString("flag_43", "flag_czech_republic")
        editor.putString("area_43", "78,866 km²")
        editor.putString("population_43", "10.9 million people")

        // Denmark
        editor.putString("name_44", "Denmark")
        editor.putString("code_44", "DK")
        editor.putString("flag_44", "flag_denmark")
        editor.putString("area_44", "42,933 km²")
        editor.putString("population_44", "5.9 million people")

        // Djibouti
        editor.putString("name_45", "Djibouti")
        editor.putString("code_45", "DJ")
        editor.putString("flag_45", "flag_djibouti")
        editor.putString("area_45", "23,200 km²")
        editor.putString("population_45", "1.1 million people")

        // Dominica
        editor.putString("name_46", "Dominica")
        editor.putString("code_46", "DM")
        editor.putString("flag_46", "flag_dominica")
        editor.putString("area_46", "751 km²")
        editor.putString("population_46", "73 thousand people")

        // Dominican Republic
        editor.putString("name_47", "Dominican Republic")
        editor.putString("code_47", "DO")
        editor.putString("flag_47", "flag_dominican_republic")
        editor.putString("area_47", "48,671 km²")
        editor.putString("population_47", "11.3 million people")

        // Ecuador
        editor.putString("name_48", "Ecuador")
        editor.putString("code_48", "EC")
        editor.putString("flag_48", "flag_ecuador")
        editor.putString("area_48", "276,841 km²")
        editor.putString("population_48", "18 million people")

        // Egypt
        editor.putString("name_49", "Egypt")
        editor.putString("code_49", "EG")
        editor.putString("flag_49", "flag_egypt")
        editor.putString("area_49", "1.010 million km²")
        editor.putString("population_49", "112 million people")

        // El Salvador
        editor.putString("name_50", "El Salvador")
        editor.putString("code_50", "SV")
        editor.putString("flag_50", "flag_el_salvador")
        editor.putString("area_50", "21,041 km²")
        editor.putString("population_50", "6.4 million people")

        // Equatorial Guinea
        editor.putString("name_51", "Equatorial Guinea")
        editor.putString("code_51", "GQ")
        editor.putString("flag_51", "flag_equatorial_guinea")
        editor.putString("area_51", "28,051 km²")
        editor.putString("population_51", "1.7 million people")

        // Eritrea
        editor.putString("name_52", "Eritrea")
        editor.putString("code_52", "ER")
        editor.putString("flag_52", "flag_eritrea")
        editor.putString("area_52", "117,600 km²")
        editor.putString("population_52", "3.7 million people")

        // Estonia
        editor.putString("name_53", "Estonia")
        editor.putString("code_53", "EE")
        editor.putString("flag_53", "flag_estonia")
        editor.putString("area_53", "45,227 km²")
        editor.putString("population_53", "1.3 million people")

        // Swaziland
        editor.putString("name_54", "Swaziland")
        editor.putString("code_54", "SZ")
        editor.putString("flag_54", "flag_swaziland")
        editor.putString("area_54", "17,364 km²")
        editor.putString("population_54", "1.2 million people")

        // Ethiopia
        editor.putString("name_55", "Ethiopia")
        editor.putString("code_55", "ET")
        editor.putString("flag_55", "flag_ethiopia")
        editor.putString("area_55", "1.104 million km²")
        editor.putString("population_55", "128 million people")

        // Fiji
        editor.putString("name_56", "Fiji")
        editor.putString("code_56", "FJ")
        editor.putString("flag_56", "flag_fiji")
        editor.putString("area_56", "18,274 km²")
        editor.putString("population_56", "930 thousand people")

        // Finland
        editor.putString("name_57", "Finland")
        editor.putString("code_57", "FI")
        editor.putString("flag_57", "flag_finland")
        editor.putString("area_57", "338,455 km²")
        editor.putString("population_57", "5.6 million people")

        // France
        editor.putString("name_58", "France")
        editor.putString("code_58", "FR")
        editor.putString("flag_58", "flag_france")
        editor.putString("area_58", "551,695 km²")
        editor.putString("population_58", "68 million people")

        // Gabon
        editor.putString("name_59", "Gabon")
        editor.putString("code_59", "GA")
        editor.putString("flag_59", "flag_gabon")
        editor.putString("area_59", "267,668 km²")
        editor.putString("population_59", "2.4 million people")

        // Gambia
        editor.putString("name_60", "Gambia")
        editor.putString("code_60", "GM")
        editor.putString("flag_60", "flag_gambia")
        editor.putString("area_60", "11,295 km²")
        editor.putString("population_60", "2.8 million people")

        // Georgia
        editor.putString("name_61", "Georgia")
        editor.putString("code_61", "GE")
        editor.putString("flag_61", "flag_georgia")
        editor.putString("area_61", "69,700 km²")
        editor.putString("population_61", "3.7 million people")

        // Germany
        editor.putString("name_62", "Germany")
        editor.putString("code_62", "DE")
        editor.putString("flag_62", "flag_germany")
        editor.putString("area_62", "357,022 km²")
        editor.putString("population_62", "84 million people")

        // Ghana
        editor.putString("name_63", "Ghana")
        editor.putString("code_63", "GH")
        editor.putString("flag_63", "flag_ghana")
        editor.putString("area_63", "238,535 km²")
        editor.putString("population_63", "34 million people")

        // Greece
        editor.putString("name_64", "Greece")
        editor.putString("code_64", "GR")
        editor.putString("flag_64", "flag_greece")
        editor.putString("area_64", "131,957 km²")
        editor.putString("population_64", "10.3 million people")

        // Grenada
        editor.putString("name_65", "Grenada")
        editor.putString("code_65", "GD")
        editor.putString("flag_65", "flag_grenada")
        editor.putString("area_65", "344 km²")
        editor.putString("population_65", "126 thousand people")

        // Guatemala
        editor.putString("name_66", "Guatemala")
        editor.putString("code_66", "GT")
        editor.putString("flag_66", "flag_guatemala")
        editor.putString("area_66", "108,889 km²")
        editor.putString("population_66", "18 million people")

        // Guinea
        editor.putString("name_67", "Guinea")
        editor.putString("code_67", "GN")
        editor.putString("flag_67", "flag_guinea")
        editor.putString("area_67", "245,857 km²")
        editor.putString("population_67", "14 million people")


        // Guinea-Bissau
        editor.putString("name_68", "Guinea-Bissau")
        editor.putString("code_68", "GW")
        editor.putString("flag_68", "flag_guinea_bissau")
        editor.putString("area_68", "36,125 km²")
        editor.putString("population_68", "2.1 million people")

        // Guyana
        editor.putString("name_69", "Guyana")
        editor.putString("code_69", "GY")
        editor.putString("flag_69", "flag_guyana")
        editor.putString("area_69", "214,969 km²")
        editor.putString("population_69", "810 thousand people")

        // Haiti
        editor.putString("name_70", "Haiti")
        editor.putString("code_70", "HT")
        editor.putString("flag_70", "flag_haiti")
        editor.putString("area_70", "27,750 km²")
        editor.putString("population_70", "11.5 million people")

        // Honduras
        editor.putString("name_71", "Honduras")
        editor.putString("code_71", "HN")
        editor.putString("flag_71", "flag_honduras")
        editor.putString("area_71", "112,492 km²")
        editor.putString("population_71", "10.8 million people")

        // Hungary
        editor.putString("name_72", "Hungary")
        editor.putString("code_72", "HU")
        editor.putString("flag_72", "flag_hungary")
        editor.putString("area_72", "93,030 km²")
        editor.putString("population_72", "9.6 million people")

        // Iceland
        editor.putString("name_73", "Iceland")
        editor.putString("code_73", "IS")
        editor.putString("flag_73", "flag_iceland")
        editor.putString("area_73", "103,000 km²")
        editor.putString("population_73", "390 thousand people")

        // India
        editor.putString("name_74", "India")
        editor.putString("code_74", "IN")
        editor.putString("flag_74", "flag_india")
        editor.putString("area_74", "3.287 million km²")
        editor.putString("population_74", "1.43 billion people")

        // Indonesia
        editor.putString("name_75", "Indonesia")
        editor.putString("code_75", "ID")
        editor.putString("flag_75", "flag_indonesia")
        editor.putString("area_75", "1.905 million km²")
        editor.putString("population_75", "277 million people")

        // Iran
        editor.putString("name_76", "Iran")
        editor.putString("code_76", "IR")
        editor.putString("flag_76", "flag_iran")
        editor.putString("area_76", "1.648 million km²")
        editor.putString("population_76", "89 million people")

        // Iraq
        editor.putString("name_77", "Iraq")
        editor.putString("code_77", "IQ")
        editor.putString("flag_77", "flag_iraq")
        editor.putString("area_77", "438,317 km²")
        editor.putString("population_77", "45 million people")

        // Ireland
        editor.putString("name_78", "Ireland")
        editor.putString("code_78", "IE")
        editor.putString("flag_78", "flag_ireland")
        editor.putString("area_78", "70,273 km²")
        editor.putString("population_78", "5.3 million people")

        // Palestine
        editor.putString("name_79", "Palestine")
        editor.putString("code_79", "PL")
        editor.putString("flag_79", "flag_palestine")
        editor.putString("area_79", "22,145 km²")
        editor.putString("population_79", "5.2 million people")

        // Italy
        editor.putString("name_80", "Italy")
        editor.putString("code_80", "IT")
        editor.putString("flag_80", "flag_italy")
        editor.putString("area_80", "301,340 km²")
        editor.putString("population_80", "59 million people")

        // Jamaica
        editor.putString("name_81", "Jamaica")
        editor.putString("code_81", "JM")
        editor.putString("flag_81", "flag_jamaica")
        editor.putString("area_81", "10,991 km²")
        editor.putString("population_81", "2.8 million people")

        // Japan
        editor.putString("name_82", "Japan")
        editor.putString("code_82", "JP")
        editor.putString("flag_82", "flag_japan")
        editor.putString("area_82", "377,975 km²")
        editor.putString("population_82", "124 million people")

        // Jordan
        editor.putString("name_83", "Jordan")
        editor.putString("code_83", "JO")
        editor.putString("flag_83", "flag_jordan")
        editor.putString("area_83", "89,342 km²")
        editor.putString("population_83", "11.3 million people")

        // Kazakhstan
        editor.putString("name_84", "Kazakhstan")
        editor.putString("code_84", "KZ")
        editor.putString("flag_84", "flag_kazakhstan")
        editor.putString("area_84", "2.725 million km²")
        editor.putString("population_84", "20 million people")

        // Kenya
        editor.putString("name_85", "Kenya")
        editor.putString("code_85", "KE")
        editor.putString("flag_85", "flag_kenya")
        editor.putString("area_85", "580,367 km²")
        editor.putString("population_85", "55 million people")

        // Kiribati
        editor.putString("name_86", "Kiribati")
        editor.putString("code_86", "KI")
        editor.putString("flag_86", "flag_kiribati")
        editor.putString("area_86", "811 km²")
        editor.putString("population_86", "133 thousand people")

        // Kuwait
        editor.putString("name_87", "Kuwait")
        editor.putString("code_87", "KW")
        editor.putString("flag_87", "flag_kuwait")
        editor.putString("area_87", "17,818 km²")
        editor.putString("population_87", "4.3 million people")

// Kyrgyzstan
        editor.putString("name_88", "Kyrgyzstan")
        editor.putString("code_88", "KG")
        editor.putString("flag_88", "flag_kyrgyzstan")
        editor.putString("area_88", "199,951 km²")
        editor.putString("population_88", "6.6 million people")

// Laos
        editor.putString("name_89", "Laos")
        editor.putString("code_89", "LA")
        editor.putString("flag_89", "flag_laos")
        editor.putString("area_89", "236,800 km²")
        editor.putString("population_89", "7.5 million people")

// Latvia
        editor.putString("name_90", "Latvia")
        editor.putString("code_90", "LV")
        editor.putString("flag_90", "flag_latvia")
        editor.putString("area_90", "64,589 km²")
        editor.putString("population_90", "1.8 million people")

// Lebanon
        editor.putString("name_91", "Lebanon")
        editor.putString("code_91", "LB")
        editor.putString("flag_91", "flag_lebanon")
        editor.putString("area_91", "10,452 km²")
        editor.putString("population_91", "6.8 million people")

// Lesotho
        editor.putString("name_92", "Lesotho")
        editor.putString("code_92", "LS")
        editor.putString("flag_92", "flag_lesotho")
        editor.putString("area_92", "30,355 km²")
        editor.putString("population_92", "2.2 million people")

// Liberia
        editor.putString("name_93", "Liberia")
        editor.putString("code_93", "LR")
        editor.putString("flag_93", "flag_liberia")
        editor.putString("area_93", "111,369 km²")
        editor.putString("population_93", "5.3 million people")

// Libya
        editor.putString("name_94", "Libya")
        editor.putString("code_94", "LY")
        editor.putString("flag_94", "flag_libya")
        editor.putString("area_94", "1.760 million km²")
        editor.putString("population_94", "6.9 million people")

// Liechtenstein
        editor.putString("name_95", "Liechtenstein")
        editor.putString("code_95", "LI")
        editor.putString("flag_95", "flag_liechtenstein")
        editor.putString("area_95", "160 km²")
        editor.putString("population_95", "39 thousand people")

// Lithuania
        editor.putString("name_96", "Lithuania")
        editor.putString("code_96", "LT")
        editor.putString("flag_96", "flag_lithuania")
        editor.putString("area_96", "65,300 km²")
        editor.putString("population_96", "2.8 million people")

// Luxembourg
        editor.putString("name_97", "Luxembourg")
        editor.putString("code_97", "LU")
        editor.putString("flag_97", "flag_luxembourg")
        editor.putString("area_97", "2,586 km²")
        editor.putString("population_97", "670 thousand people")

// Madagascar
        editor.putString("name_98", "Madagascar")
        editor.putString("code_98", "MG")
        editor.putString("flag_98", "flag_madagascar")
        editor.putString("area_98", "587,041 km²")
        editor.putString("population_98", "28 million people")

// Malawi
        editor.putString("name_99", "Malawi")
        editor.putString("code_99", "MW")
        editor.putString("flag_99", "flag_malawi")
        editor.putString("area_99", "118,484 km²")
        editor.putString("population_99", "20 million people")

// Malaysia
        editor.putString("name_100", "Malaysia")
        editor.putString("code_100", "MY")
        editor.putString("flag_100", "flag_malaysia")
        editor.putString("area_100", "330,803 km²")
        editor.putString("population_100", "33 million people")

// Maldives
        editor.putString("name_101", "Maldives")
        editor.putString("code_101", "MV")
        editor.putString("flag_101", "flag_maldives")
        editor.putString("area_101", "300 km²")
        editor.putString("population_101", "540 thousand people")

// Mali
        editor.putString("name_102", "Mali")
        editor.putString("code_102", "ML")
        editor.putString("flag_102", "flag_mali")
        editor.putString("area_102", "1.240 million km²")
        editor.putString("population_102", "21 million people")

// Malta
        editor.putString("name_103", "Malta")
        editor.putString("code_103", "MT")
        editor.putString("flag_103", "flag_malta")
        editor.putString("area_103", "316 km²")
        editor.putString("population_103", "520 thousand people")

// Marshall Islands
        editor.putString("name_104", "Marshall Islands")
        editor.putString("code_104", "MH")
        editor.putString("flag_104", "flag_marshall_islands")
        editor.putString("area_104", "181 km²")
        editor.putString("population_104", "59 thousand people")

// Mauritania
        editor.putString("name_105", "Mauritania")
        editor.putString("code_105", "MR")
        editor.putString("flag_105", "flag_mauritania")
        editor.putString("area_105", "1.030 million km²")
        editor.putString("population_105", "4.5 million people")

// Mauritius
        editor.putString("name_106", "Mauritius")
        editor.putString("code_106", "MU")
        editor.putString("flag_106", "flag_mauritius")
        editor.putString("area_106", "2,040 km²")
        editor.putString("population_106", "1.3 million people")

// Mexico
        editor.putString("name_107", "Mexico")
        editor.putString("code_107", "MX")
        editor.putString("flag_107", "flag_mexico")
        editor.putString("area_107", "1.964 million km²")
        editor.putString("population_107", "129 million people")

// Micronesia
        editor.putString("name_108", "Micronesia")
        editor.putString("code_108", "FM")
        editor.putString("flag_108", "flag_micronesia")
        editor.putString("area_108", "702 km²")
        editor.putString("population_108", "115 thousand people")

// Moldova
        editor.putString("name_109", "Moldova")
        editor.putString("code_109", "MD")
        editor.putString("flag_109", "flag_moldova")
        editor.putString("area_109", "33,846 km²")
        editor.putString("population_109", "2.6 million people")

// Monaco
        editor.putString("name_110", "Monaco")
        editor.putString("code_110", "MC")
        editor.putString("flag_110", "flag_monaco")
        editor.putString("area_110", "2 km²")
        editor.putString("population_110", "39 thousand people")

// Mongolia
        editor.putString("name_111", "Mongolia")
        editor.putString("code_111", "MN")
        editor.putString("flag_111", "flag_mongolia")
        editor.putString("area_111", "1.566 million km²")
        editor.putString("population_111", "3.4 million people")

// Montenegro
        editor.putString("name_112", "Montenegro")
        editor.putString("code_112", "ME")
        editor.putString("flag_112", "flag_montenegro")
        editor.putString("area_112", "13,812 km²")
        editor.putString("population_112", "622 thousand people")

// Morocco
        editor.putString("name_113", "Morocco")
        editor.putString("code_113", "MA")
        editor.putString("flag_113", "flag_morocco")
        editor.putString("area_113", "446,550 km²")
        editor.putString("population_113", "37 million people")

// Mozambique
        editor.putString("name_114", "Mozambique")
        editor.putString("code_114", "MZ")
        editor.putString("flag_114", "flag_mozambique")
        editor.putString("area_114", "801,590 km²")
        editor.putString("population_114", "33 million people")

// Myanmar
        editor.putString("name_115", "Myanmar")
        editor.putString("code_115", "MM")
        editor.putString("flag_115", "flag_myanmar")
        editor.putString("area_115", "676,578 km²")
        editor.putString("population_115", "54 million people")

// Namibia
        editor.putString("name_116", "Namibia")
        editor.putString("code_116", "NA")
        editor.putString("flag_116", "flag_namibia")
        editor.putString("area_116", "824,292 km²")
        editor.putString("population_116", "2.7 million people")

// Nauru
        editor.putString("name_117", "Nauru")
        editor.putString("code_117", "NR")
        editor.putString("flag_117", "flag_nauru")
        editor.putString("area_117", "21 km²")
        editor.putString("population_117", "10 thousand people")

// Nepal
        editor.putString("name_118", "Nepal")
        editor.putString("code_118", "NP")
        editor.putString("flag_118", "flag_nepal")
        editor.putString("area_118", "147,516 km²")
        editor.putString("population_118", "30 million people")

// Netherlands
        editor.putString("name_119", "Netherlands")
        editor.putString("code_119", "NL")
        editor.putString("flag_119", "flag_netherlands")
        editor.putString("area_119", "41,543 km²")
        editor.putString("population_119", "17.6 million people")

// New Zealand
        editor.putString("name_120", "New Zealand")
        editor.putString("code_120", "NZ")
        editor.putString("flag_120", "flag_new_zealand")
        editor.putString("area_120", "268,838 km²")
        editor.putString("population_120", "5.2 million people")

// Nicaragua
        editor.putString("name_121", "Nicaragua")
        editor.putString("code_121", "NI")
        editor.putString("flag_121", "flag_nicaragua")
        editor.putString("area_121", "130,375 km²")
        editor.putString("population_121", "6.9 million people")

// Niger
        editor.putString("name_122", "Niger")
        editor.putString("code_122", "NE")
        editor.putString("flag_122", "flag_niger")
        editor.putString("area_122", "1.267 million km²")
        editor.putString("population_122", "26 million people")

// Nigeria
        editor.putString("name_123", "Nigeria")
        editor.putString("code_123", "NG")
        editor.putString("flag_123", "flag_nigeria")
        editor.putString("area_123", "923,768 km²")
        editor.putString("population_123", "223 million people")

// North Korea
        editor.putString("name_124", "North Korea")
        editor.putString("code_124", "KP")
        editor.putString("flag_124", "flag_north_korea")
        editor.putString("area_124", "120,540 km²")
        editor.putString("population_124", "25.7 million people")

// North Macedonia
        editor.putString("name_125", "North Macedonia")
        editor.putString("code_125", "MK")
        editor.putString("flag_125", "flag_north_macedonia")
        editor.putString("area_125", "25,713 km²")
        editor.putString("population_125", "2.1 million people")

// Norway
        editor.putString("name_126", "Norway")
        editor.putString("code_126", "NO")
        editor.putString("flag_126", "flag_norway")
        editor.putString("area_126", "385,207 km²")
        editor.putString("population_126", "5.4 million people")

// Oman
        editor.putString("name_127", "Oman")
        editor.putString("code_127", "OM")
        editor.putString("flag_127", "flag_oman")
        editor.putString("area_127", "309,500 km²")
        editor.putString("population_127", "5.5 million people")


// Pakistan
        editor.putString("name_128", "Pakistan")
        editor.putString("code_128", "PK")
        editor.putString("flag_128", "flag_pakistan")
        editor.putString("area_128", "881,913 km²")
        editor.putString("population_128", "242 million people")

// Palau
        editor.putString("name_129", "Palau")
        editor.putString("code_129", "PW")
        editor.putString("flag_129", "flag_palau")
        editor.putString("area_129", "459 km²")
        editor.putString("population_129", "21 thousand people")

// Palestine
        editor.putString("name_130", "Palestine")
        editor.putString("code_130", "PS")
        editor.putString("flag_130", "flag_palestine")
        editor.putString("area_130", "6,020 km²")
        editor.putString("population_130", "5.2 million people")

// Panama
        editor.putString("name_131", "Panama")
        editor.putString("code_131", "PA")
        editor.putString("flag_131", "flag_panama")
        editor.putString("area_131", "75,417 km²")
        editor.putString("population_131", "4.5 million people")

// Papua New Guinea
        editor.putString("name_132", "Papua New Guinea")
        editor.putString("code_132", "PG")
        editor.putString("flag_132", "flag_papua_new_guinea")
        editor.putString("area_132", "462,840 km²")
        editor.putString("population_132", "9.3 million people")

// Paraguay
        editor.putString("name_133", "Paraguay")
        editor.putString("code_133", "PY")
        editor.putString("flag_133", "flag_paraguay")
        editor.putString("area_133", "406,752 km²")
        editor.putString("population_133", "7.3 million people")

// Peru
        editor.putString("name_134", "Peru")
        editor.putString("code_134", "PE")
        editor.putString("flag_134", "flag_peru")
        editor.putString("area_134", "1.285 million km²")
        editor.putString("population_134", "34 million people")

// Philippines
        editor.putString("name_135", "Philippines")
        editor.putString("code_135", "PH")
        editor.putString("flag_135", "flag_philippines")
        editor.putString("area_135", "300,000 km²")
        editor.putString("population_135", "114 million people")

// Poland
        editor.putString("name_136", "Poland")
        editor.putString("code_136", "PL")
        editor.putString("flag_136", "flag_poland")
        editor.putString("area_136", "312,696 km²")
        editor.putString("population_136", "38 million people")

// Portugal
        editor.putString("name_137", "Portugal")
        editor.putString("code_137", "PT")
        editor.putString("flag_137", "flag_portugal")
        editor.putString("area_137", "92,090 km²")
        editor.putString("population_137", "10.3 million people")

// Qatar
        editor.putString("name_138", "Qatar")
        editor.putString("code_138", "QA")
        editor.putString("flag_138", "flag_qatar")
        editor.putString("area_138", "11,586 km²")
        editor.putString("population_138", "2.9 million people")

// Romania
        editor.putString("name_139", "Romania")
        editor.putString("code_139", "RO")
        editor.putString("flag_139", "flag_romania")
        editor.putString("area_139", "238,397 km²")
        editor.putString("population_139", "19 million people")

// Russia
        editor.putString("name_140", "Russia")
        editor.putString("code_140", "RU")
        editor.putString("flag_140", "flag_russia")
        editor.putString("area_140", "17.1 million km²")
        editor.putString("population_140", "144 million people")

// Rwanda
        editor.putString("name_141", "Rwanda")
        editor.putString("code_141", "RW")
        editor.putString("flag_141", "flag_rwanda")
        editor.putString("area_141", "26,338 km²")
        editor.putString("population_141", "13.2 million people")

// Saint Kitts and Nevis
        editor.putString("name_142", "Saint Kitts and Nevis")
        editor.putString("code_142", "KN")
        editor.putString("flag_142", "flag_saint_kitts_and_nevis")
        editor.putString("area_142", "261 km²")
        editor.putString("population_142", "53 thousand people")


// Saint Lucia
        editor.putString("name_143", "Saint Lucia")
        editor.putString("code_143", "LC")
        editor.putString("flag_143", "flag_saint_lucia")
        editor.putString("area_143", "617 km²")
        editor.putString("population_143", "180 thousand people")

// Saint Vincent and the Grenadines
        editor.putString("name_144", "Saint Vincent and the Grenadines")
        editor.putString("code_144", "VC")
        editor.putString("flag_144", "flag_saint_vincent_and_the_grenadines")
        editor.putString("area_144", "389 km²")
        editor.putString("population_144", "110 thousand people")

// Samoa
        editor.putString("name_145", "Samoa")
        editor.putString("code_145", "WS")
        editor.putString("flag_145", "flag_samoa")
        editor.putString("area_145", "2,831 km²")
        editor.putString("population_145", "210 thousand people")

// San Marino
        editor.putString("name_146", "San Marino")
        editor.putString("code_146", "SM")
        editor.putString("flag_146", "flag_san_marino")
        editor.putString("area_146", "61 km²")
        editor.putString("population_146", "34 thousand people")

// São Tomé and Príncipe
        editor.putString("name_147", "São Tomé and Príncipe")
        editor.putString("code_147", "ST")
        editor.putString("flag_147", "flag_sao_tome_and_principe")
        editor.putString("area_147", "964 km²")
        editor.putString("population_147", "228 thousand people")

// Saudi Arabia
        editor.putString("name_148", "Saudi Arabia")
        editor.putString("code_148", "SA")
        editor.putString("flag_148", "flag_saudi_arabia")
        editor.putString("area_148", "2.150 million km²")
        editor.putString("population_148", "36 million people")

// Senegal
        editor.putString("name_149", "Senegal")
        editor.putString("code_149", "SN")
        editor.putString("flag_149", "flag_senegal")
        editor.putString("area_149", "196,722 km²")
        editor.putString("population_149", "18 million people")

// Serbia
        editor.putString("name_150", "Serbia")
        editor.putString("code_150", "RS")
        editor.putString("flag_150", "flag_serbia")
        editor.putString("area_150", "77,474 km²")
        editor.putString("population_150", "6.7 million people")

// Seychelles
        editor.putString("name_151", "Seychelles")
        editor.putString("code_151", "SC")
        editor.putString("flag_151", "flag_seychelles")
        editor.putString("area_151", "455 km²")
        editor.putString("population_151", "100 thousand people")

// Sierra Leone
        editor.putString("name_152", "Sierra Leone")
        editor.putString("code_152", "SL")
        editor.putString("flag_152", "flag_sierra_leone")
        editor.putString("area_152", "71,740 km²")
        editor.putString("population_152", "8.1 million people")

// Singapore
        editor.putString("name_153", "Singapore")
        editor.putString("code_153", "SG")
        editor.putString("flag_153", "flag_singapore")
        editor.putString("area_153", "728 km²")
        editor.putString("population_153", "5.7 million people")

// Slovakia
        editor.putString("name_154", "Slovakia")
        editor.putString("code_154", "SK")
        editor.putString("flag_154", "flag_slovakia")
        editor.putString("area_154", "49,035 km²")
        editor.putString("population_154", "5.5 million people")

// Slovenia
        editor.putString("name_155", "Slovenia")
        editor.putString("code_155", "SI")
        editor.putString("flag_155", "flag_slovenia")
        editor.putString("area_155", "20,273 km²")
        editor.putString("population_155", "2.1 million people")

// Solomon Islands
        editor.putString("name_156", "Solomon Islands")
        editor.putString("code_156", "SB")
        editor.putString("flag_156", "flag_solomon_islands")
        editor.putString("area_156", "28,896 km²")
        editor.putString("population_156", "741 thousand people")

// Somalia
        editor.putString("name_157", "Somalia")
        editor.putString("code_157", "SO")
        editor.putString("flag_157", "flag_somalia")
        editor.putString("area_157", "637,657 km²")
        editor.putString("population_157", "18 million people")

// South Africa
        editor.putString("name_158", "South Africa")
        editor.putString("code_158", "ZA")
        editor.putString("flag_158", "flag_south_africa")
        editor.putString("area_158", "1.221 million km²")
        editor.putString("population_158", "61 million people")

// South Korea
        editor.putString("name_159", "South Korea")
        editor.putString("code_159", "KR")
        editor.putString("flag_159", "flag_south_korea")
        editor.putString("area_159", "100,210 km²")
        editor.putString("population_159", "52 million people")

// South Sudan
        editor.putString("name_160", "South Sudan")
        editor.putString("code_160", "SS")
        editor.putString("flag_160", "flag_south_sudan")
        editor.putString("area_160", "619,745 km²")
        editor.putString("population_160", "11 million people")

// Spain
        editor.putString("name_161", "Spain")
        editor.putString("code_161", "ES")
        editor.putString("flag_161", "flag_spain")
        editor.putString("area_161", "505,992 km²")
        editor.putString("population_161", "47 million people")

// Sri Lanka
        editor.putString("name_162", "Sri Lanka")
        editor.putString("code_162", "LK")
        editor.putString("flag_162", "flag_sri_lanka")
        editor.putString("area_162", "65,610 km²")
        editor.putString("population_162", "22 million people")

// Sudan
        editor.putString("name_163", "Sudan")
        editor.putString("code_163", "SD")
        editor.putString("flag_163", "flag_sudan")
        editor.putString("area_163", "1.861 million km²")
        editor.putString("population_163", "48 million people")

// Suriname
        editor.putString("name_164", "Suriname")
        editor.putString("code_164", "SR")
        editor.putString("flag_164", "flag_suriname")
        editor.putString("area_164", "163,820 km²")
        editor.putString("population_164", "0.6 million people")

// Sweden
        editor.putString("name_165", "Sweden")
        editor.putString("code_165", "SE")
        editor.putString("flag_165", "flag_sweden")
        editor.putString("area_165", "450,295 km²")
        editor.putString("population_165", "10.4 million people")

// Switzerland
        editor.putString("name_166", "Switzerland")
        editor.putString("code_166", "CH")
        editor.putString("flag_166", "flag_switzerland")
        editor.putString("area_166", "41,285 km²")
        editor.putString("population_166", "8.7 million people")

// Syria
        editor.putString("name_167", "Syria")
        editor.putString("code_167", "SY")
        editor.putString("flag_167", "flag_syria")
        editor.putString("area_167", "185,180 km²")
        editor.putString("population_167", "22 million people")

// Taiwan
        editor.putString("name_168", "Taiwan")
        editor.putString("code_168", "TW")
        editor.putString("flag_168", "flag_taiwan")
        editor.putString("area_168", "36,193 km²")
        editor.putString("population_168", "23.5 million people")

// Tajikistan
        editor.putString("name_169", "Tajikistan")
        editor.putString("code_169", "TJ")
        editor.putString("flag_169", "flag_tajikistan")
        editor.putString("area_169", "143,100 km²")
        editor.putString("population_169", "10 million people")

// Tanzania
        editor.putString("name_170", "Tanzania")
        editor.putString("code_170", "TZ")
        editor.putString("flag_170", "flag_tanzania")
        editor.putString("area_170", "945,087 km²")
        editor.putString("population_170", "63 million people")

// Thailand
        editor.putString("name_171", "Thailand")
        editor.putString("code_171", "TH")
        editor.putString("flag_171", "flag_thailand")
        editor.putString("area_171", "513,120 km²")
        editor.putString("population_171", "71 million people")

// Timor-Leste
        editor.putString("name_172", "Timor-Leste")
        editor.putString("code_172", "TL")
        editor.putString("flag_172", "flag_timor_leste")
        editor.putString("area_172", "14,874 km²")
        editor.putString("population_172", "1.3 million people")

// Togo
        editor.putString("name_173", "Togo")
        editor.putString("code_173", "TG")
        editor.putString("flag_173", "flag_togo")
        editor.putString("area_173", "56,785 km²")
        editor.putString("population_173", "8.6 million people")

// Tonga
        editor.putString("name_174", "Tonga")
        editor.putString("code_174", "TO")
        editor.putString("flag_174", "flag_tonga")
        editor.putString("area_174", "747 km²")
        editor.putString("population_174", "107 thousand people")

// Trinidad and Tobago
        editor.putString("name_175", "Trinidad and Tobago")
        editor.putString("code_175", "TT")
        editor.putString("flag_175", "flag_trinidad_and_tobago")
        editor.putString("area_175", "5,128 km²")
        editor.putString("population_175", "1.4 million people")

// Tunisia
        editor.putString("name_176", "Tunisia")
        editor.putString("code_176", "TN")
        editor.putString("flag_176", "flag_tunisia")
        editor.putString("area_176", "163,610 km²")
        editor.putString("population_176", "12 million people")

// Turkey
        editor.putString("name_177", "Turkey")
        editor.putString("code_177", "TR")
        editor.putString("flag_177", "flag_turkey")
        editor.putString("area_177", "783,562 km²")
        editor.putString("population_177", "87 million people")

// Turkmenistan
        editor.putString("name_178", "Turkmenistan")
        editor.putString("code_178", "TM")
        editor.putString("flag_178", "flag_turkmenistan")
        editor.putString("area_178", "488,100 km²")
        editor.putString("population_178", "6.2 million people")

// Tuvalu
        editor.putString("name_179", "Tuvalu")
        editor.putString("code_179", "TV")
        editor.putString("flag_179", "flag_tuvalu")
        editor.putString("area_179", "26 km²")
        editor.putString("population_179", "12 thousand people")

// Uganda
        editor.putString("name_180", "Uganda")
        editor.putString("code_180", "UG")
        editor.putString("flag_180", "flag_uganda")
        editor.putString("area_180", "241,038 km²")
        editor.putString("population_180", "48 million people")

// Ukraine
        editor.putString("name_181", "Ukraine")
        editor.putString("code_181", "UA")
        editor.putString("flag_181", "flag_ukraine")
        editor.putString("area_181", "603,500 km²")
        editor.putString("population_181", "44 million people")

// United Arab Emirates
        editor.putString("name_182", "United Arab Emirates")
        editor.putString("code_182", "AE")
        editor.putString("flag_182", "flag_united_arab_emirates")
        editor.putString("area_182", "83,600 km²")
        editor.putString("population_182", "9.9 million people")

// United Kingdom
        editor.putString("name_183", "United Kingdom")
        editor.putString("code_183", "GB")
        editor.putString("flag_183", "flag_united_kingdom")
        editor.putString("area_183", "242,495 km²")
        editor.putString("population_183", "67 million people")

// United States
        editor.putString("name_184", "United States")
        editor.putString("code_184", "US")
        editor.putString("flag_184", "flag_united_states")
        editor.putString("area_184", "9.834 million km²")
        editor.putString("population_184", "332 million people")

// Uruguay
        editor.putString("name_185", "Uruguay")
        editor.putString("code_185", "UY")
        editor.putString("flag_185", "flag_uruguay")
        editor.putString("area_185", "176,215 km²")
        editor.putString("population_185", "3.5 million people")

// Uzbekistan
        editor.putString("name_186", "Uzbekistan")
        editor.putString("code_186", "UZ")
        editor.putString("flag_186", "flag_uzbekistan")
        editor.putString("area_186", "447,400 km²")
        editor.putString("population_186", "36 million people")

// Vanuatu
        editor.putString("name_187", "Vanuatu")
        editor.putString("code_187", "VU")
        editor.putString("flag_187", "flag_vanuatu")
        editor.putString("area_187", "12,189 km²")
        editor.putString("population_187", "324 thousand people")

// Vatican City
        editor.putString("name_188", "Vatican City")
        editor.putString("code_188", "VA")
        editor.putString("flag_188", "flag_vatican_city")
        editor.putString("area_188", "0.44 km²")
        editor.putString("population_188", "825 people")

// Venezuela
        editor.putString("name_189", "Venezuela")
        editor.putString("code_189", "VE")
        editor.putString("flag_189", "flag_venezuela")
        editor.putString("area_189", "912,050 km²")
        editor.putString("population_189", "28 million people")

// Vietnam
        editor.putString("name_190", "Vietnam")
        editor.putString("code_190", "VN")
        editor.putString("flag_190", "flag_vietnam")
        editor.putString("area_190", "331,212 km²")
        editor.putString("population_190", "99 million people")

// Yemen
        editor.putString("name_191", "Yemen")
        editor.putString("code_191", "YE")
        editor.putString("flag_191", "flag_yemen")
        editor.putString("area_191", "527,968 km²")
        editor.putString("population_191", "34 million people")

// Zambia
        editor.putString("name_192", "Zambia")
        editor.putString("code_192", "ZM")
        editor.putString("flag_192", "flag_zambia")
        editor.putString("area_192", "752,618 km²")
        editor.putString("population_192", "19 million people")

// Zimbabwe
        editor.putString("name_193", "Zimbabwe")
        editor.putString("code_193", "ZW")
        editor.putString("flag_193", "flag_zimbabwe")
        editor.putString("area_193", "390,757 km²")
        editor.putString("population_193", "15 million people")




        editor.apply()
    }


    fun getRandomCountry () : Country {
        val id = Random.nextInt(1, totalCountries+1)
        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        val area = preferences.getString("area_${id}", null)
        val population = preferences.getString("population_${id}", null)
        return Country(id, name, code, flag, area, population)
    }

    fun getRandomCountry (excluded: Int) : Country {
        var id = 0
        do {
            id = Random.nextInt(1, totalCountries+1)
        }while (id == excluded)

        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        val area = preferences.getString("area_${id}", null)
        val population = preferences.getString("population_${id}", null)
        return Country(id, name, code, flag, area, population)
    }

    fun getRandomCountry (excluded1: Int, excluded2: Int) : Country {
        var id = 0
        do {
            id = Random.nextInt(1, totalCountries+1)
        }while (id == excluded1 || id == excluded2)

        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        val area = preferences.getString("area_${id}", null)
        val population = preferences.getString("population_${id}", null)
        return Country(id, name, code, flag, area, population)
    }

    fun getRandomCountry (excluded1: Int, excluded2: Int, excluded3: Int) : Country {
        var id = 0
        do {
            id = Random.nextInt(1, totalCountries+1)
        }while (id == excluded1 || id == excluded2 || id == excluded3)

        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        val area = preferences.getString("area_${id}", null)
        val population = preferences.getString("population_${id}", null)
        return Country(id, name, code, flag, area, population)
    }

    fun getRandomCountry (excluded1: Int, excluded2: Int, excluded3: Int, excluded4: Int) : Country {
        var id = 0
        do {
            id = Random.nextInt(1, totalCountries+1)
        }while (id == excluded1 || id == excluded2 || id == excluded3 || id == excluded4)

        val name = preferences.getString("name_${id}", null)
        val code = preferences.getString("code_${id}", null)
        val flag = preferences.getString("flag_${id}", null)
        val area = preferences.getString("area_${id}", null)
        val population = preferences.getString("population_${id}", null)
        return Country(id, name, code, flag, area, population)
    }

    fun getCountriesList () : ArrayList<Country> {
        val countries = arrayListOf<Country>()
        for (id in 1..totalCountries) {
            val name = preferences.getString("name_${id}", null)
            val code = preferences.getString("code_${id}", null)
            val flag = preferences.getString("flag_${id}", null)
            val area = preferences.getString("area_${id}", null)
            val population = preferences.getString("population_${id}", null)
            countries.add( Country(id, name, code, flag, area, population))
        }
        return countries
    }


}