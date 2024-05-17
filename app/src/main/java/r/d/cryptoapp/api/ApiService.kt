package r.d.cryptoapp.api

import io.reactivex.Single
import r.d.cryptoapp.pojo.CoinInfoListOfData
import r.d.cryptoapp.pojo.CoinPriceInfoRawData
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("top/totalvolfull")
    fun getTopCoinsInfo(
//        @Query(QUERY_PARAM_API_KEY) apiKey: String = "3beb7ded5e7a31ba8d9bdd2db5b3c51ccb7c19f0754ff9d886670d9f706c1c7e",
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "",
        @Query(QUERY_PARAM_LIMIT) limit: Int = 10,
        @Query(QUERY_PARAM_TO_SYMBOL) tSym: String = CURRENCY
    ) : Single<CoinInfoListOfData>

    @GET("pricemultifull")
    fun getFullPriceList(
//        @Query(QUERY_PARAM_API_KEY) apiKey: String = "3beb7ded5e7a31ba8d9bdd2db5b3c51ccb7c19f0754ff9d886670d9f706c1c7e",
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "",
        @Query(QUERY_PARAM_FROM_SYMBOLS) fSyms: String,
        @Query(QUERY_PARAM_TO_SYMBOLS) tSyms: String = CURRENCY

    ) : Single<CoinPriceInfoRawData>


    companion object {
        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_PARAM_LIMIT = "limit"

        private const val QUERY_PARAM_TO_SYMBOL = "tsym"
        private const val QUERY_PARAM_TO_SYMBOLS = "tsyms"
        private const val QUERY_PARAM_FROM_SYMBOLS = "fsyms"

        private const val CURRENCY = "USD"
    }


}