Feature: Search Feature

Scenario: Menampilkan field list berdasarkan nama
  When Admin pilih filter nama
  And Admin input erbina pada search
  And Admin klik enter pada keyboard
  Then Admin get name search erbina

  Scenario: Menampilkan field list berdasarkan nama invalid
    When Admin pilih filter nama
    And Admin input cipung pada search
    And Admin klik enter pada keyboard
    Then Admin get name search cipung

  Scenario: Menampilkan field list berdasarkan email
    When Admin pilih filter email
    And Admin input agussalim@gmail.com pada search
    Then Admin get email search agussalim@gmail.com

  Scenario: Menampilkan field list berdasarkan email invalid
    When Admin pilih filter email
    And Admin input wakanda@gmail.com pada search
    And Admin klik enter pada keyboard
    Then Admin get email search wakanda@gmail.com

